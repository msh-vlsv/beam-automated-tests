package utils.driver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static IphoneDriver getDriver(DeviceName deviceName) {
        switch (deviceName) {
            case IPHONE_8:
                return new Iphone8Driver();
            case IPHONE_XS_SIMULATOR:
                return new IphoneXsSimulatorDriver();
            case IPHONE_8_PLUS_SIMULATOR:
                return new Iphone8PlusSimulatorDriver();
            default:
                throw new IllegalArgumentException("Unknown device name " + deviceName.toString());
        }
    }
}
