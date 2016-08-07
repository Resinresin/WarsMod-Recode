package the_fireplace.wars.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.items.*;


public abstract class WarsItems {


	public static ArmorMaterial scoutArmor = EnumHelper.addArmorMaterial("SCOUT", "warsmod_scout", -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial guardArmor = EnumHelper.addArmorMaterial("GUARD", "warsmod_guard", -1, new int[] { 2, 6, 5, 2 }, 9);
	public static ArmorMaterial healerArmor = EnumHelper.addArmorMaterial("HEALER", "warsmod_healer", -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial archerArmor = EnumHelper.addArmorMaterial("ARCHER", "warsmod_archer", -1, new int[] { 1, 3, 2, 1 }, 15);
	public static ArmorMaterial knightArmor = EnumHelper.addArmorMaterial("KNIGHT", "warsmod_knight", -1, new int[] { 4, 9, 7, 4 }, 10);
	public static ArmorMaterial techArmor = EnumHelper.addArmorMaterial("TECH", "warsmod_tech", -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial bootsArmor = EnumHelper.addArmorMaterial("BOOT", "warsmod_", -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial readArmor = EnumHelper.addArmorMaterial("READ", "warsmod_", -1, new int[] { 0, 0, 0, 0 }, 30);
	public static ArmorMaterial chaosArmor = EnumHelper.addArmorMaterial("CHAOS", "warsmod_chaos", -1, new int[] { 0, 0, 0, 0 }, 30);

	public static ToolMaterial healTool = EnumHelper.addToolMaterial("HEALT", 0, 0, 0F, 0, 0);

	public static Item ancientGem;
	public static Item ancientEmblem;
	public static Item magicPotato;
	public static Item shadowFlesh;
	public static Item warCheese;
	public static Item battleBurger;
	public static Item longBannana;
	public static Item workWaffel;
	public static Item scoutBlade;
	public static Item guardSword;
	public static Item knightSword;
	public static Item wizardStaff;
	public static Item bowArcher;
	public static Item techSpanner;
	public static Item dagger;
	public static Item chaosSword;
	public static Item scoutHelm;
	public static Item scoutPlate;
	public static Item scoutLegs;
	public static Item techHelm;
	public static Item techPlate;
	public static Item techLegs;
	public static Item healerHelm;
	public static Item healerPlate;
	public static Item healerLegs;
	public static Item archerHelm;
	public static Item archerPlate;
	public static Item archerLegs;
	public static Item knightHelm;
	public static Item knightPlate;
	public static Item knightLegs;
	public static Item guardHelm;
	public static Item guardPlate;
	public static Item guardLegs;
	public static Item chaosHelm;
	public static Item chaosPlate;
	public static Item chaosLegs;
	public static Item redBoots;
	public static Item greenBoots;
	public static Item yellowBoots;
	public static Item blueBoots;
	public static Item waterGem;
	public static Item fireGem;
	public static Item decayGem;
	public static Item naturalGem;
	public static Item aWandTNT;
	public static Item aWandBall;
	public static Item aWandStone;
	public static Item aWandWeb;
	public static Item aWandLight;
	public static Item chaosBoots;
	public static Item antidote;

	public static void createItems() {


		ancientGem = new ItemAncientGem().setUnlocalizedName("ancientGem");
		ancientEmblem = new ItemAncientEmblem().setUnlocalizedName("ancientEmblem").setCreativeTab(WarsMod.tabWarsItems);
		magicPotato = new ItemMagicPotato(3).setUnlocalizedName("magicPotato").setCreativeTab(WarsMod.tabWarsItems);
		shadowFlesh = new ItemShadowFlesh(3).setUnlocalizedName("shadowFlesh").setCreativeTab(WarsMod.tabWarsItems);
		warCheese = new ItemWarCheese(3).setUnlocalizedName("warCheese").setCreativeTab(WarsMod.tabWarsItems);
		battleBurger = new ItemBattleBurgur(0).setUnlocalizedName("battleBurger").setCreativeTab(WarsMod.tabWarsItems);
		longBannana = new ItemLongRangeBananna(4).setUnlocalizedName("longRangeBanana").setCreativeTab(WarsMod.tabWarsItems);
		workWaffel = new ItemWorkWaffel(0).setUnlocalizedName("workWaffel").setCreativeTab(WarsMod.tabWarsItems);
		scoutBlade = new ItemScoutsDagger().setUnlocalizedName("scoutSword").setCreativeTab(WarsMod.tabWarsClasses);
		guardSword = new ItemGuardSword().setUnlocalizedName("guardSword").setCreativeTab(WarsMod.tabWarsClasses);
		knightSword = new ItemKnightSword().setUnlocalizedName("knightSword").setCreativeTab(WarsMod.tabWarsClasses);
		wizardStaff = new ItemWizardStaff().setUnlocalizedName("wizardStaff").setCreativeTab(WarsMod.tabWarsClasses);
		bowArcher = new ItemArcherBow().setUnlocalizedName("ArcherBow").setCreativeTab(WarsMod.tabWarsClasses);
		techSpanner = new ItemTechSpanner().setUnlocalizedName("techSpanner").setCreativeTab(WarsMod.tabWarsClasses);
		dagger = new ItemMeleeDagger().setUnlocalizedName("dagger").setCreativeTab(WarsMod.tabWarsClasses);
		chaosSword = new ItemChaosSword().setUnlocalizedName("chaosSword").setCreativeTab(WarsMod.tabWarsClasses);
		scoutHelm = new ItemArmorMod(scoutArmor, 0).setUnlocalizedName("scoutHelm").setCreativeTab(WarsMod.tabWarsClasses);
		scoutPlate = new ItemArmorMod(scoutArmor, 1).setUnlocalizedName("scoutChest").setCreativeTab(WarsMod.tabWarsClasses);
		scoutLegs = new ItemArmorMod(scoutArmor, 2).setUnlocalizedName("scoutLegs").setCreativeTab(WarsMod.tabWarsClasses);
		techHelm = new ItemArmorMod(techArmor, 0).setUnlocalizedName("techHelm").setCreativeTab(WarsMod.tabWarsClasses);
		techPlate = new ItemArmorMod(techArmor, 1).setUnlocalizedName("techChest").setCreativeTab(WarsMod.tabWarsClasses);
		techLegs = new ItemArmorMod(techArmor, 2).setUnlocalizedName("techLegs").setCreativeTab(WarsMod.tabWarsClasses);
		healerHelm = new ItemArmorMod(healerArmor, 0).setUnlocalizedName("healerHelm").setCreativeTab(WarsMod.tabWarsClasses);
		healerPlate = new ItemArmorMod(healerArmor, 1).setUnlocalizedName("healerChest").setCreativeTab(WarsMod.tabWarsClasses);
		healerLegs = new ItemArmorMod(healerArmor, 2).setUnlocalizedName("healerLegs").setCreativeTab(WarsMod.tabWarsClasses);
		archerHelm = new ItemArmorMod(archerArmor, 0).setUnlocalizedName("archerHelm").setCreativeTab(WarsMod.tabWarsClasses);
		archerPlate = new ItemArmorMod(archerArmor, 1).setUnlocalizedName("archerChest").setCreativeTab(WarsMod.tabWarsClasses);
		archerLegs = new ItemArmorMod(archerArmor, 2).setUnlocalizedName("archerLegs").setCreativeTab(WarsMod.tabWarsClasses);
		knightHelm = new ItemArmorMod(knightArmor, 0).setUnlocalizedName("knightHelm").setCreativeTab(WarsMod.tabWarsClasses);
		knightPlate = new ItemArmorMod(knightArmor, 1).setUnlocalizedName("knightChest").setCreativeTab(WarsMod.tabWarsClasses);
		knightLegs = new ItemArmorMod(knightArmor, 2).setUnlocalizedName("knightLegs").setCreativeTab(WarsMod.tabWarsClasses);
		guardHelm = new ItemArmorMod(guardArmor, 0).setUnlocalizedName("guardHelm").setCreativeTab(WarsMod.tabWarsClasses);
		guardPlate = new ItemArmorMod(guardArmor, 1).setUnlocalizedName("guardChest").setCreativeTab(WarsMod.tabWarsClasses);
		guardLegs = new ItemArmorMod(guardArmor, 2).setUnlocalizedName("guardLegs").setCreativeTab(WarsMod.tabWarsClasses);
		chaosHelm = new ItemArmorMod(chaosArmor, 0).setUnlocalizedName("chaosHelm").setCreativeTab(WarsMod.tabWarsClasses);
		chaosPlate = new ItemArmorMod(chaosArmor, 1).setUnlocalizedName("chaosChest").setCreativeTab(WarsMod.tabWarsClasses);
		chaosLegs = new ItemArmorMod(chaosArmor, 2).setUnlocalizedName("chaosLegs").setCreativeTab(WarsMod.tabWarsClasses);
		redBoots = new ItemArmorMod(bootsArmor, 3).setUnlocalizedName("redBoots").setCreativeTab(WarsMod.tabWarsClasses);
		greenBoots = new ItemArmorMod(bootsArmor, 3).setUnlocalizedName("greenBoots").setCreativeTab(WarsMod.tabWarsClasses);
		yellowBoots = new ItemArmorMod(bootsArmor, 3).setUnlocalizedName("yellowBoots").setCreativeTab(WarsMod.tabWarsClasses);
		blueBoots = new ItemArmorMod(bootsArmor, 3).setUnlocalizedName("blueBoots").setCreativeTab(WarsMod.tabWarsClasses);
		chaosBoots = new ItemArmorMod(bootsArmor, 3).setUnlocalizedName("chaosBoots").setCreativeTab(WarsMod.tabWarsClasses);
		waterGem = new ItemWaterGem().setUnlocalizedName("waterGem");
		fireGem = new ItemFireGem().setUnlocalizedName("fireGem");
		decayGem = new ItemDecayGem().setUnlocalizedName("decayGem");
		naturalGem = new ItemNaturalGem().setUnlocalizedName("naturalGem");
		aWandTNT = new ItemAdminWandTNT().setUnlocalizedName("aWandTNT");
		aWandBall = new ItemAdminWandBall().setUnlocalizedName("aWandBall");
		aWandStone = new ItemAdminWandStone().setUnlocalizedName("aWandStone");
		aWandWeb = new ItemAdminWandWeb().setUnlocalizedName("aWandWeb");
		aWandLight = new ItemAdminWandLight().setUnlocalizedName("aWandLight");
		antidote = new ItemAntidote().setUnlocalizedName("antidote");

		GameRegistry.registerItem(ancientGem, "ancientGem");
		GameRegistry.registerItem(ancientEmblem, "ancientEmblem");
		GameRegistry.registerItem(magicPotato, "magicPotato");
		GameRegistry.registerItem(shadowFlesh, "shadowFlesh");
		GameRegistry.registerItem(warCheese, "warCheese");
		GameRegistry.registerItem(battleBurger, "battleBurger");
		GameRegistry.registerItem(longBannana, "longBannana");
		GameRegistry.registerItem(workWaffel, "workWaffel");
		GameRegistry.registerItem(scoutBlade, "scoutBlade");
		GameRegistry.registerItem(knightSword, "knightSword");
		GameRegistry.registerItem(guardSword, "guardSword");
		GameRegistry.registerItem(wizardStaff, "wizardStaff");
		GameRegistry.registerItem(techSpanner, "techSpanner");
		GameRegistry.registerItem(dagger, "dagger");
		GameRegistry.registerItem(chaosSword, "chaosSword");
		GameRegistry.registerItem(scoutHelm, "scoutHelm");
		GameRegistry.registerItem(scoutPlate, "scoutPlate");
		GameRegistry.registerItem(scoutLegs, "scoutLegs");
		GameRegistry.registerItem(techHelm, "techHelm");
		GameRegistry.registerItem(techPlate, "techPlate");
		GameRegistry.registerItem(techLegs, "techLegs");
		GameRegistry.registerItem(healerHelm, "healerHelm");
		GameRegistry.registerItem(healerPlate, "healerPlate");
		GameRegistry.registerItem(healerLegs, "healerLegs");
		GameRegistry.registerItem(archerHelm, "archerHelm");
		GameRegistry.registerItem(archerPlate, "archerPlate");
		GameRegistry.registerItem(archerLegs, "archerLegs");
		GameRegistry.registerItem(knightHelm, "knightHelm");
		GameRegistry.registerItem(knightPlate, "knightPlate");
		GameRegistry.registerItem(knightLegs, "knightLegs");
		GameRegistry.registerItem(guardHelm, "guardHelm");
		GameRegistry.registerItem(guardPlate, "guardPlate");
		GameRegistry.registerItem(guardLegs, "guardLegs");
		GameRegistry.registerItem(chaosHelm, "chaosHelm");
		GameRegistry.registerItem(chaosPlate, "chaosPlate");
		GameRegistry.registerItem(chaosLegs, "chaosLegs");
		GameRegistry.registerItem(redBoots, "redBoots");
		GameRegistry.registerItem(greenBoots, "greenBoots");
		GameRegistry.registerItem(yellowBoots, "yellowBoots");
		GameRegistry.registerItem(blueBoots, "blueBoots");
		GameRegistry.registerItem(waterGem, "waterGem");
		GameRegistry.registerItem(fireGem, "fireGem");
		GameRegistry.registerItem(decayGem, "decayGem");
		GameRegistry.registerItem(naturalGem, "naturalGem");
		GameRegistry.registerItem(aWandTNT, "aWandTNT");
		GameRegistry.registerItem(aWandBall, "aWandBall");
		GameRegistry.registerItem(aWandStone, "aWandStone");
		GameRegistry.registerItem(aWandWeb, "aWandWeb");
		GameRegistry.registerItem(aWandLight, "aWandLight");
		GameRegistry.registerItem(chaosBoots, "chaosBoots");
		GameRegistry.registerItem(antidote, "antidote");
		GameRegistry.registerItem(bowArcher, "ArcherBow");
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemRenders() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ancientGem, 0, new ModelResourceLocation("warsmod:ancientGem", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ancientEmblem, 0, new ModelResourceLocation("warsmod:ancientEmblem", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(magicPotato, 0, new ModelResourceLocation("warsmod:magicPotato", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(shadowFlesh, 0, new ModelResourceLocation("warsmod:shadowFlesh", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(warCheese, 0, new ModelResourceLocation("warsmod:warCheese", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(battleBurger, 0, new ModelResourceLocation("warsmod:battleBurger", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(longBannana, 0, new ModelResourceLocation("warsmod:longBannana", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(workWaffel, 0, new ModelResourceLocation("warsmod:workWaffel", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(scoutBlade, 0, new ModelResourceLocation("warsmod:scoutBlade", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(guardSword, 0, new ModelResourceLocation("warsmod:guardSword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(knightSword, 0, new ModelResourceLocation("warsmod:knightSword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(wizardStaff, 0, new ModelResourceLocation("warsmod:wizardStaff", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(techSpanner, 0, new ModelResourceLocation("warsmod:techSpanner", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dagger, 0, new ModelResourceLocation("warsmod:dagger", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chaosSword, 0, new ModelResourceLocation("warsmod:chaosSword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(scoutHelm, 0, new ModelResourceLocation("warsmod:scoutHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(scoutPlate, 0, new ModelResourceLocation("warsmod:scoutPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(scoutLegs, 0, new ModelResourceLocation("warsmod:scoutLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(techHelm, 0, new ModelResourceLocation("warsmod:techHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(techPlate, 0, new ModelResourceLocation("warsmod:techPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(techLegs, 0, new ModelResourceLocation("warsmod:techLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(healerHelm, 0, new ModelResourceLocation("warsmod:healerHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(healerPlate, 0, new ModelResourceLocation("warsmod:healerPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(healerLegs, 0, new ModelResourceLocation("warsmod:healerLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(archerHelm, 0, new ModelResourceLocation("warsmod:archerHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(archerPlate, 0, new ModelResourceLocation("warsmod:archerPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(archerLegs, 0, new ModelResourceLocation("warsmod:archerLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(knightHelm, 0, new ModelResourceLocation("warsmod:knightHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(knightPlate, 0, new ModelResourceLocation("warsmod:knightPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(knightLegs, 0, new ModelResourceLocation("warsmod:knightLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(guardHelm, 0, new ModelResourceLocation("warsmod:guardHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(guardPlate, 0, new ModelResourceLocation("warsmod:guardPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(guardLegs, 0, new ModelResourceLocation("warsmod:guardLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chaosHelm, 0, new ModelResourceLocation("warsmod:chaosHelm", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chaosPlate, 0, new ModelResourceLocation("warsmod:chaosPlate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chaosLegs, 0, new ModelResourceLocation("warsmod:chaosLegs", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(redBoots, 0, new ModelResourceLocation("warsmod:redBoots", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(greenBoots, 0, new ModelResourceLocation("warsmod:greenBoots", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(yellowBoots, 0, new ModelResourceLocation("warsmod:yellowBoots", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(blueBoots, 0, new ModelResourceLocation("warsmod:blueBoots", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(waterGem, 0, new ModelResourceLocation("warsmod:waterGem", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(fireGem, 0, new ModelResourceLocation("warsmod:fireGem", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(decayGem, 0, new ModelResourceLocation("warsmod:decayGem", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(naturalGem, 0, new ModelResourceLocation("warsmod:naturalGem", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(aWandTNT, 0, new ModelResourceLocation("warsmod:aWandTNT", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(aWandBall, 0, new ModelResourceLocation("warsmod:aWandBall", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(aWandStone, 0, new ModelResourceLocation("warsmod:aWandStone", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(aWandWeb, 0, new ModelResourceLocation("warsmod:aWandWeb", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(aWandLight, 0, new ModelResourceLocation("warsmod:aWandLight", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(chaosBoots, 0, new ModelResourceLocation("warsmod:chaosBoots", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(antidote, 0, new ModelResourceLocation("warsmod:antidote", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowArcher, 0, new ModelResourceLocation("warsmod:ArcherBow", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowArcher, 1, new ModelResourceLocation("warsmod:archerBow1", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowArcher, 2, new ModelResourceLocation("warsmod:archerBow2", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(bowArcher, 3, new ModelResourceLocation("warsmod:archerBow3", "inventory"));
	}



}