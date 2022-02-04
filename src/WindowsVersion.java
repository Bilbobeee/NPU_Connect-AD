
// #3

public class WindowsVersion {
    private boolean result;

// The method gets the version Windows and return true if this is Windows 10,
// or return false if this version of Windows is <10

    public String checkVersionWindows(){

        String versionWin = System.getProperties().get("os.name").toString();
//        String versionWin = "Windows 7";


        return versionWin;
    }
}
