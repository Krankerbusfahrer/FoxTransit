package commutertransitpack.common.entity.locomotive;

import commutertransitpack.client.render.locomotive.electric.ModelSD100Front;
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

public class ElectricSD100Front extends ElectricTrain {

    public ElectricSD100Front(World world) {
        super(world);    
        InsertTexture(0, " Old RTD Denver Livery for the SD100");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 2.95f, -0.1f, 0.1f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }

    @Override
    public String transportCountry() {
        return Transport.SD100Front().country;
    }


    @Override
    public String transportYear() {
        return Transport.SD100Front().year;
    }

    public String getInventoryName() {
        return Transport.SD100Front().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SD100Front().fictional;
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
                        ElectricSD100Front.class, new ModelSD100Front(),
                        "SD100_",
                        new float[]{-1.1f, 0.2F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "orange":
                                texturePath = "textures/trains/SD100/SD100_orange";
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
