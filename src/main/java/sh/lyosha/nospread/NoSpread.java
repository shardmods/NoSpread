package sh.lyosha.nospread;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoSpread implements ModInitializer {
    private static final Logger logger = LoggerFactory.getLogger(NoSpread.class);

    @Override
    public void onInitialize() {
        logger.info("NoSpread loaded");
    }
}
