public class NewAdapter implements NewProcess{
    OldProcess oldProcess;

    public NewAdapter() {
        oldProcess = new OldProcess();
    }

    public void mixProcessor(){
        oldProcess.imgProcessor();
    }
}
