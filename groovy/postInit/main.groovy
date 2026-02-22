import com.weishengsu.upgradedarmaments.util.UpgradeStationUtil;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
ConfigManager.sync((String)"upgradedarmaments", (Config.Type)Config.Type.INSTANCE);
UpgradeStationUtil.initUpgradeMaterials();