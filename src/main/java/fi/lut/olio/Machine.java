package fi.lut.olio;

// luodaan machine-luokka
public class Machine {
    private String type;
    private String model;
    private Worker operator;

    public Machine(String type, String model, Worker operator) {
        this.type = type;
        this.model = model;
        this.operator = operator;
    }

    // metodi koneen ja työntekijän tietojen hakemiseen
    public String getMachineDetails(){
        String details = "Koneen tiedot: " + type + ", " + model + "\n"
                + "Työntekijän tiedot: " + operator.getWorkerName() + ", " + operator.getWorkerRole();
        return details;
    }
}