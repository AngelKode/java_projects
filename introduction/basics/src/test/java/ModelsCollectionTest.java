import com.learning.epamTask.logic.ModelsCollection;
import com.learning.epamTask.models.ElectricModel;
import com.learning.epamTask.models.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ModelsCollectionTest {
    private final ModelsCollection modelsCollection = new ModelsCollection();

    private void readModels() {
        modelsCollection.readFromFile("./src/test/input/models.csv");
    }

    @Test
    public void testGetModelByManufacturerAndModelName() {
        readModels();
        String manufacturer = "Tesla";
        String modelName = "Model 3 RWD";

        Optional<Model> optionalModel = modelsCollection.getModel(manufacturer, modelName);

        assertTrue(optionalModel.isPresent(),
                "Query by 'Tesla' manufacturer and 'Model 3 RWD' modelName should be present");
        Model model = optionalModel.get();
        assertEquals(manufacturer, model.getManufacturer(), "Manufacturer should be 'Tesla'");
        assertEquals(modelName, model.getModelName(), "ModelName should be 'Model 3 RWD'");
        assertEquals(208, model.getPower(), "power should be 208");

        assertInstanceOf(ElectricModel.class, model, "Model should be an instance of ElectricModel");
        ElectricModel electricModel = (ElectricModel) model;
        assertEquals(60, electricModel.getBatteryCapacity(), "battery capacity should be 60");
        assertEquals(20, electricModel.getEnergyConsumption(), "energy consumption should be 20");
    }

    @Test
    public void testGetElectricModelsByBatteryCapacity() {
        readModels();
        int batteryCapacityLimit = 60;

        List<ElectricModel> returned = modelsCollection.getElectricModelsByBatteryCapacity(batteryCapacityLimit);
        System.out.println(returned);
        assertEquals(3, returned.size(), "There should be 3 model");
        assertEquals("Hyundai", returned.get(0).getManufacturer(), "First model should be from Hyundai");
        assertEquals("Tesla", returned.get(1).getManufacturer(), "Second model should be from Tesla");
        assertEquals("Volkswagen", returned.get(2).getManufacturer(), "Third model should be from Volkswagen");
    }

    @Test
    public void testReadFromFileError() {
        String filePath = "non_existent_file.csv";

        RuntimeException exception = Assertions.assertThrows(RuntimeException.class,
                () -> modelsCollection.readFromFile(filePath),
                "Should throw RuntimeException when reading from a non-existent file."
        );
        assertEquals("Error occurred while reading file: " + filePath, exception.getMessage());
    }
}

