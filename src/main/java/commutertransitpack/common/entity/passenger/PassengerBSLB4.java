package commutertransitpack.common.entity.passenger;

import commutertransitpack.client.render.locomotive.electric.ModelBSLB4;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class PassengerBSLB4 extends AbstractPassengerCar
{

	public PassengerBSLB4(World world)
	{
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 1.2f, -0.2f, 0.75f);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 1.1F;
	}

	@Override
	public void onRenderInsertRecord() {
		Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new TrainRenderRecord(commutertransitpack.common.library.Info.modID,
						commutertransitpack.common.entity.passenger.PassengerBSLB4.class, new ModelBSLB4(),
						"BSLB4_",
						new float[]{-1.3f, 0.2F, 0.0F},
						new float[]{0F, 180F, 180F},
						null) {
					@Override
					public ResourceLocation getTextureFile(String colorAsString) {
						String texturePath = "";
						switch (colorAsString.toLowerCase()) {
							case "orange":
								texturePath = "textures/trains/BSLB4/BSLB4_orange";
								break;

						}
						texturePath += ".png";

						return new ResourceLocation(commutertransitpack.common.library.Info.modID, texturePath);
					}
				});
	}
}