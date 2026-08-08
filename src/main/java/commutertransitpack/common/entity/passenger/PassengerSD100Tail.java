package commutertransitpack.common.entity.passenger;

import commutertransitpack.client.render.locomotive.electric.ModelSD100Tail;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class PassengerSD100Tail extends AbstractPassengerCar
{

	public PassengerSD100Tail(World world)
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
		return 1F;
	}

	@Override
	public void onRenderInsertRecord() {
		Traincraft.traincraftRegistry.RegisterRollingStockModel(
				new TrainRenderRecord(commutertransitpack.common.library.Info.modID,
						PassengerSD100Tail.class, new ModelSD100Tail(),
						"SD100_",
						new float[]{-1.3f, 0.2F, 0.0F},
						new float[]{0F, 180F, 180F},
						null) {
					@Override
					public ResourceLocation getTextureFile(String colorAsString) {
						String texturePath = "";
						switch (colorAsString.toLowerCase()) {
							case "orange":
								texturePath = "textures/trains/SD100/SD100_orange";
								break;
							case "blue":
								texturePath = "textures/trains/SD100/SD100_blue";
								break;
							case "yellow":
								texturePath = "textures/trains/SD100/SD100_yellow";
								break;

						}
						texturePath += ".png";

						return new ResourceLocation(commutertransitpack.common.library.Info.modID, texturePath);
					}
				});
	}
}