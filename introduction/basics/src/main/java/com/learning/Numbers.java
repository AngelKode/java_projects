package com.learning;

import javax.swing.JOptionPane;

public class Numbers {
    public static void main(String[] args) {
        // Number to binary
        int myNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Type the number..."));

        String outputMessage = "";

        // Binary representation
        var binaryRepresentation = Integer.toBinaryString(myNumber);
        outputMessage += String.format("%d to binary: %s\n", myNumber,binaryRepresentation);

        // Octal representation
        var myOctalNumber = Integer.toOctalString(myNumber);
        outputMessage += String.format("%d to Octal number: %s\n", myNumber, myOctalNumber);

        // Hexadecimal representation
        var myHexaNumber = Integer.toHexString(myNumber);
        outputMessage += String.format("%d to hexadecimal: %s\n", myNumber, myHexaNumber);

        // Show results in a window
        JOptionPane.showMessageDialog(null, outputMessage, "Operations Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
