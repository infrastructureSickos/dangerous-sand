package com.infrastructuresickos.dangerous_sand;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("dangerous_sand")
public class DangerousSand {
    public static final Logger LOGGER = LogManager.getLogger();

    public DangerousSand() {
        LOGGER.info("DangerousSand mod initialized");
    }
}
