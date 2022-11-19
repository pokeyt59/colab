// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart thornreed;

	public Modelcustom_model(ModelPart root) {
		this.thornreed = root.getChild("thornreed");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition thornreed = partdefinition.addOrReplaceChild("thornreed",
				CubeListBuilder.create().texOffs(-1, 10)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(-1, 12)
						.addBox(-5.0F, -11.0F, 4.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(4.0F, -11.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition thorns = thornreed.addOrReplaceChild("thorns", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pair1 = thorns.addOrReplaceChild("pair1", CubeListBuilder.create(),
				PartPose.offset(5.3774F, -10.9991F, -2.9552F));

		PartDefinition thornpair1 = pair1.addOrReplaceChild(
				"thornpair1", CubeListBuilder.create().texOffs(28, 30).addBox(-1.1274F, -0.9509F, -0.0448F, 2.0F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition leave2_r1 = thornpair1.addOrReplaceChild("leave2_r1",
				CubeListBuilder.create().texOffs(24, 30).addBox(-1.1292F, -0.9095F, 0.0004F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0518F, -0.0414F, 0.0448F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair2 = pair1.addOrReplaceChild("thornpair2",
				CubeListBuilder.create().texOffs(20, 30).addBox(-1.0894F, -1.0F, 0.0198F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0615F, 0.0078F, 2.9354F, 0.0F, 0.0F, 0.7854F));

		PartDefinition leave3_r1 = thornpair2.addOrReplaceChild("leave3_r1",
				CubeListBuilder.create().texOffs(16, 30).addBox(-1.1292F, -0.9095F, 0.0004F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0898F, -0.0905F, 0.1094F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair3 = pair1.addOrReplaceChild("thornpair3",
				CubeListBuilder.create().texOffs(28, 28).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9896F, 0.0091F, 7.9328F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leave4_r1 = thornpair3.addOrReplaceChild("leave4_r1",
				CubeListBuilder.create().texOffs(28, 26).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair4 = pair1.addOrReplaceChild("thornpair4",
				CubeListBuilder.create().texOffs(24, 28).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9896F, 0.0091F, 7.9328F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leave5_r1 = thornpair4.addOrReplaceChild("leave5_r1",
				CubeListBuilder.create().texOffs(28, 22).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair5 = pair1.addOrReplaceChild("thornpair5",
				CubeListBuilder.create().texOffs(28, 20).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9896F, 0.0091F, 7.9328F, -0.7854F, 0.0F, 0.0F));

		PartDefinition leave6_r1 = thornpair5.addOrReplaceChild("leave6_r1",
				CubeListBuilder.create().texOffs(20, 28).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair6 = pair1.addOrReplaceChild("thornpair6",
				CubeListBuilder.create().texOffs(28, 18).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9896F, 0.0091F, 5.9328F, 0.0F, 0.0F, -0.6545F));

		PartDefinition leave7_r1 = thornpair6.addOrReplaceChild("leave7_r1",
				CubeListBuilder.create().texOffs(28, 16).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition pair2 = thorns.addOrReplaceChild("pair2", CubeListBuilder.create(),
				PartPose.offset(5.3774F, -10.9991F, -2.9552F));

		PartDefinition thornpair7 = pair2.addOrReplaceChild("thornpair7",
				CubeListBuilder.create().texOffs(20, 26).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9896F, 0.0091F, 2.9328F, 0.0F, 0.0F, -0.6545F));

		PartDefinition leave8_r1 = thornpair7.addOrReplaceChild("leave8_r1",
				CubeListBuilder.create().texOffs(28, 24).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair8 = pair2.addOrReplaceChild("thornpair8",
				CubeListBuilder.create().texOffs(24, 24).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9896F, 0.0091F, -0.0672F, 0.0F, 0.0F, -0.6545F));

		PartDefinition leave9_r1 = thornpair8.addOrReplaceChild("leave9_r1",
				CubeListBuilder.create().texOffs(20, 24).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair9 = pair2.addOrReplaceChild("thornpair9",
				CubeListBuilder.create().texOffs(24, 20).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9896F, 0.0091F, -2.0672F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leave10_r1 = thornpair9.addOrReplaceChild("leave10_r1",
				CubeListBuilder.create().texOffs(20, 20).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair10 = pair2.addOrReplaceChild("thornpair10",
				CubeListBuilder.create().texOffs(24, 18).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9896F, 0.0091F, -2.0672F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leave11_r1 = thornpair10.addOrReplaceChild("leave11_r1",
				CubeListBuilder.create().texOffs(24, 16).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair11 = pair2.addOrReplaceChild("thornpair11",
				CubeListBuilder.create().texOffs(24, 14).addBox(-0.9878F, -1.0F, 0.0224F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9896F, 0.0091F, -2.0672F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leave12_r1 = thornpair11.addOrReplaceChild("leave12_r1",
				CubeListBuilder.create().texOffs(20, 18).addBox(-1.0052F, -0.9988F, 0.0296F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, -0.0012F, -0.0172F, 0.0F, -1.5708F, 0.0F));

		PartDefinition thornpair12 = pair2.addOrReplaceChild("thornpair12",
				CubeListBuilder.create().texOffs(20, 16).addBox(-1.0894F, -1.0F, 0.0198F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0615F, 0.0078F, 5.9354F, 0.0F, 0.0F, 0.7854F));

		PartDefinition leave4_r2 = thornpair12.addOrReplaceChild("leave4_r2",
				CubeListBuilder.create().texOffs(20, 14).addBox(-1.1292F, -0.9095F, 0.0004F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0898F, -0.0905F, 0.1094F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		thornreed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}