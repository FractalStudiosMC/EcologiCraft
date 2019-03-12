package com.fractalmc.ecologicraft.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ECLogger
{
    public final String MOD_NAME;
    public static Logger ecologiCraftLogger;

    private ECLogger(String modName)
    {
        this.MOD_NAME = modName;

        ecologiCraftLogger = LogManager.getLogger(MOD_NAME);
    }

    public void log(Level logLevel, String format, String... msg)
    {
        ecologiCraftLogger.log(logLevel, String.format(format, msg));
    }

    public void log(Level logLevel, String msg)
    {
        log(logLevel, "%s", msg);
    }

    public void logInfo(String message)
    {
        log(Level.INFO, message);
    }

    public void logWarn(String message)
    {
        log(Level.WARN, message);
    }

    public void logError(String message)
    {
        log(Level.ERROR, message);
    }

    public void logFatalError(String message)
    {
        log(Level.FATAL, message);
    }

    public void logDebug(String message)
    {
        log(Level.DEBUG, message);
    }

    public void logDebugTrace(String message)
    {
        log(Level.TRACE, message);
    }

    public static ECLogger createEcologiCraftLogger(String modName)
    {
        return new ECLogger(modName);
    }
}
