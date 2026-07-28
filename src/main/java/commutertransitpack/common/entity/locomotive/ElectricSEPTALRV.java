package commutertransitpack.common.entity.locomotive;

import commutertransitpack.client.render.locomotive.electric.ModelSEPTALRV;
import commutertransitpack.common.core.handler.Transport;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricSEPTALRV extends ElectricTrain {

    public ElectricSEPTALRV(World world) {
        super(world);    
        InsertTexture(0, "Standard Livery for SEPTA LRV");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.55f, -0.2f, 0.0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.4F;
    }

    @Override
    public String transportCountry() {
        return Transport.SEPTALRV().country;
    }


    @Override
    public String transportYear() {
        return Transport.SEPTALRV().year;
    }

    public String getInventoryName() {
        return Transport.SEPTALRV().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SEPTALRV().fictional;
    }

    //@Override
    //public ElectricSEPTALRV(World world) {
       // super(world);
      //initOverlayTextures();
      //getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
    //         "Destination Sign",
    //        40, 12, 11, EnumOverlayFonts.OxygenSansSmall, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
    //      new Point[]{new Point(334, 141)})
    // );

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(commutertransitpack.common.library.Info.modID,
                        ElectricSEPTALRV.class, new ModelSEPTALRV(),
                        "SEPTALRV_",
                        new float[]{-1.3f, 0.2F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "white":
                                texturePath = "textures/trains/SEPTALRV/SEPTALRV_white";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(commutertransitpack.common.library.Info.modID, texturePath);
                    }
                });
    }

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.locoElectricBR185;
    }
}
