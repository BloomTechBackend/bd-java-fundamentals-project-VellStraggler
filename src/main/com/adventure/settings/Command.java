package main.com.adventure.settings;

public class Command {

    private CommandVerb verb;
    private String objectName;

    /**
     * Creates a command.
     * @param verb - the verb of the command
     * @param objectName - the object(s) to which the command is directed.
     */
    public Command(String verb, String objectName) {
        this.verb = CommandVerb.getVerb(verb);
        this.objectName = objectName;
    }

    /**
     * Creates a command with no direct object (e.g. "help").
     * @param verb - the verb of the command
     */
    public Command(String verb) {
        this.verb = CommandVerb.getVerb(verb);
        this.objectName = "";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CommandVerb getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = CommandVerb.getVerb(verb);
    }

    @Override
    public String toString() {
        return "Command{" +
                "verb='" + verb + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
