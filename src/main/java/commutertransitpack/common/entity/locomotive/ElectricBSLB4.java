package commutertransitpack.common.entity.locomotive;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import commutertransitpack.client.render.locomotive.electric.ModelBSLB4;
import commutertransitpack.common.core.handler.Transport;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class ElectricBSLB4 extends ElectricTrain {

    public ElectricBSLB4(World world) {
        super(world);    
        InsertTexture(0, "Old version of the BSL Livery");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.8f, 0.2f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.95F;
    }

    @Override
    public String transportCountry() {
        return Transport.BSLB4().country;
    }


    @Override
    public String transportYear() {
        return Transport.BSLB4().year;
    }

    public String getInventoryName() {
        return Transport.BSLB4().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.BSLB4().fictional;
    }

    //@Override
    // public ElectricBSLB4(World world) {
    //    super(world);
    //  initOverlayTextures();
    // getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
    //         "Destination Sign",
    //        40, 12, 11, EnumOverlayFonts.OxygenSansSmall, 16f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
    //       new Point[]{new Point(334, 141)})
    // );

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(commutertransitpack.common.library.Info.modID,
                        commutertransitpack.common.entity.locomotive.ElectricBSLB4.class, new ModelBSLB4(),
                        "BSLB4_",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "Orange":
                                texturePath = "textures/trains/BSLB4/";
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
