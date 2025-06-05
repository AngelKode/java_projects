package com.learning;

public enum Coffee {
    COLOMBIAN("acid","medium",200),
    SWEDISH("acid", "low",350);

    private String type, toast;
    private int weight;

    Coffee(String _type, String _toast, int _weight){
        this.type = _type;
        this.toast = _toast;
        this.weight = _weight;
    }

    String getType(){
        return this.type;
    }

    String getToast(){
        return this.toast;
    }

    int getWeight(){
        return this.weight;
    }
}