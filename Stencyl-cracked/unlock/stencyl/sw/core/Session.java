package stencyl.sw.core;

public final class Session {
    private static final Session instance = new Session();
    public static final boolean DEBUG_THREADING = false;

    private Session() {}

    public static Session instance() {
        return instance;
    }

    public String getUsername() { return "ProUser"; }
    public String getPassword() { return "Unlocked"; }
    public int getUsergroup() { return 3; }
    public String getDefaultUsername() { return "ProUser"; }
    public String getDefaultPassword() { return "Unlocked"; }
    
    public boolean isAdmin() { return true; }
    public boolean isSignedIn() { return true; }
    public boolean isSomeKindOfSubscriber() { return true; }
    public boolean isIOSSubscriber() { return true; }
    public boolean isFlashSubscriber() { return true; }
    
    public boolean canEditResource(String name) { return true; }
    public String getJavaHome() { return System.getProperty("java.home"); }
    public boolean showEULA() { return false; }
    public boolean sentEULA() { return true; }
    public boolean isExpiredSubscriber() { return false; }
    
    public boolean isGCIAutoupdateEnabled() { return true; }
    public boolean isGCILoggingEnabled() { return true; }
}
