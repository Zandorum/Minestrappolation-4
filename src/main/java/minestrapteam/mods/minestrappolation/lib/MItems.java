package minestrapteam.mods.minestrappolation.lib;

import minestrapteam.mods.minestrappolation.Minestrappolation;
import minestrapteam.mods.minestrappolation.item.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;

public class MItems extends Item
{
	public static ArrayList<Item> itemList = new ArrayList<Item>();

	//Fruits and Vegetables
	public static Item blueberry;
	public static Item blackberry;
	public static Item raspberry;
	public static Item strawberry;
	public static Item pepper;
	public static Item celery;
	public static Item tomato;
	public static Item corn_on_stick;
	public static Item grilled_corn;

	//Bread-Based Foods
	public static Item corn_meal;
	public static Item corn_bread;
	public static Item dough;
	public static Item sugar_dough;
	public static Item chocolate_dough;
	public static Item sugar_cookie;
	public static Item bun;
	public static Item pbj_sandwich;
	public static Item salmon_burger;
	public static Item hamburger;
	public static Item dry_spaghetti;
	public static Item pie_crust;
	public static Item apple_pie;

	//Bowl-Based Food Items
	public static Item bread_bowl;
	public static Item bread_mushroom_stew;
	public static Item bread_rabbit_stew;
	public static Item fried_egg;
	public static Item bread_fried_egg;
	public static Item rice_bowl;
	public static Item bread_rice_bowl;
	public static Item stir_fry;
	public static Item bread_stir_fry;
	public static Item tomato_sauce;
	public static Item bread_tomato_sauce;
	public static Item tomato_soup;
	public static Item bread_tomato_soup;
	public static Item spaghetti;
	public static Item bread_spaghetti;
	public static Item ice_cream;
	public static Item bread_ice_cream;
	public static Item popcorn;
	public static Item bread_popcorn;
	public static Item glowshroom_stew;
	public static Item bread_glowshroom_stew;

	public static Item salad;
	public static Item bread_salad;
	public static Item health_salad;
	public static Item bread_health_salad;
	public static Item saturation_salad;
	public static Item bread_saturation_salad;
	public static Item speed_salad;
	public static Item bread_speed_salad;
	public static Item strength_salad;
	public static Item bread_strength_salad;

	//Bottle-Based Food Items
	public static Item jam_bottle;
	public static Item peanut_butter_bottle;
	public static Item hot_sauce;

	//Meats
	public static Item fat;
	public static Item squid_tentacle;
	public static Item calamari;
	public static Item sushi;
	public static Item lucky_sushi;
	public static Item onigiri;
	public static Item flesh;

	//Fried Foods
	public static Item fries;
	public static Item fried_fish;
	public static Item fried_salmon;
	public static Item fish_and_chips;

	//Misc Foods
	public static Item candy_red;
	public static Item candy_blue;
	public static Item candy_yellow;

	//Plant Products
	public static Item mana_leaf;
	public static Item terracreep_spore;

	//Minerals
	public static Item copper_ingot;
	public static Item tin_ingot;
	public static Item bronze_ingot;
	public static Item steel_ingot;
	public static Item sunstone_shard;
	public static Item plutonium;
	public static Item uranium;
	public static Item radiant_quartz;
	public static Item meurodite_gem;
	public static Item soul_gem;
	public static Item torite_ingot;
	public static Item desert_quartz_item;
	public static Item blaze_shard;
	public static Item blazium_ingot;
	public static Item titanium_ingot;
	public static Item glacieric_ice_shard;
	public static Item glacierite_ingot;
	public static Item dimensium_ingot;
	public static Item dimensium_dust;
	public static Item jadachite_shard;

	public static Item tin_plating;
	public static Item bronze_plating;
	public static Item steel_plating;
	public static Item meurodite_plating;

	//Crafting Materials
	public static Item mud_ball;
	public static Item crushed_ice;
	public static Item tallow;
	public static Item grease;
	public static Item reinforced_stick;
	public static Item animal_bones;
	public static Item wing_sinew;
	public static Item wing_segment;
	public static Item heart_piece;
	public static Item pig_foot;
	public static Item cow_foot;
	public static Item sheep_foot;
	public static Item chicken_foot;
	public static Item wolf_hide;
	public static Item propeller;
	public static Item technological_doodad;
	public static Item advanced_tech_doodad;
	public static Item inert_chip;
	public static Item ice_charge;
	public static Item guano;
	public static Item slime_core;
	public static Item ender_aura;
	public static Item wither_bone;
	public static Item deathmeal;
	public static Item will_o_wisp;
	public static Item diamond_dust;
	public static Item inert_crystal_heart;
	public static Item crystal_heart;
	public static Item cow_gene_sample;
	public static Item infectious_fungus;
	public static Item chicken_gene_sample;
	public static Item wolf_gene_sample;
	public static Item sheep_gene_sample;
	public static Item rabbit_gene_sample;
	public static Item bat_gene_sample;

	//Stonecutter
	public static Item chunks;
	public static Item dimensium_chunk;
	public static Item continnium_chunk;
	public static Item bricks;
	public static Item bricks2;

	//Tools and Weapons
	public static Item copper_pickaxe;
	public static Item copper_axe;
	public static Item copper_shovel;
	public static Item copper_hoe;
	public static Item copper_sword;

	public static Item bronze_pickaxe;
	public static Item bronze_axe;
	public static Item bronze_shovel;
	public static Item bronze_hoe;
	public static Item bronze_sword;

	public static Item steel_pickaxe;
	public static Item steel_axe;
	public static Item steel_shovel;
	public static Item steel_hoe;
	public static Item steel_sword;

	public static Item meurodite_pickaxe;
	public static Item meurodite_axe;
	public static Item meurodite_shovel;
	public static Item meurodite_hoe;
	public static Item meurodite_sword;

	public static Item torite_pickaxe;
	public static Item torite_axe;
	public static Item torite_shovel;
	public static Item torite_hoe;
	public static Item torite_sword;

	public static Item ice_pickaxe;
	public static Item ice_axe;
	public static Item ice_shovel;
	public static Item ice_hoe;
	public static Item ice_sword;

	public static Item fire_pickaxe;
	public static Item fire_axe;
	public static Item fire_shovel;
	public static Item fire_hoe;
	public static Item fire_sword;

	public static Item titanium_pickaxe;
	public static Item titanium_axe;
	public static Item titanium_shovel;
	public static Item titanium_hoe;
	public static Item titanium_sword;

	public static Item bedrock_pickaxe;
	public static Item bedrock_axe;
	public static Item bedrock_shovel;
	public static Item bedrock_hoe;

	public static Item wrench;

	//Armor
	public static Item rad_helmet;
	public static Item rad_chestplate;
	public static Item rad_leggings;
	public static Item rad_boots;

	public static Item tin_helmet;
	public static Item tin_chestplate;
	public static Item tin_leggings;
	public static Item tin_boots;

	public static Item bronze_helmet;
	public static Item bronze_chestplate;
	public static Item bronze_leggings;
	public static Item bronze_boots;

	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;

	public static Item meurodite_helmet;
	public static Item meurodite_chestplate;
	public static Item meurodite_leggings;
	public static Item meurodite_boots;

	public static Item torite_helmet;
	public static Item torite_chestplate;
	public static Item torite_leggings;
	public static Item torite_boots;

	public static Item ice_helmet;
	public static Item ice_chestplate;
	public static Item ice_leggings;
	public static Item ice_boots;

	public static Item blazium_helmet;
	public static Item blazium_chestplate;
	public static Item blazium_leggings;
	public static Item blazium_boots;

	public static Item titanium_helmet;
	public static Item titanium_chestplate;
	public static Item titanium_leggings;
	public static Item titanium_boots;

	//Specialty Tools
	public static Item sifter;
	public static Item titanium_sifter;
	public static Item empty_titanium_sifter;
	public static Item charge_gun;
	public static Item heart_container;
	public static Item soulbottle;
	public static Item hangglider;
	public static Item amuletPorcum;
	public static Item amuletVaccam;
	public static Item amuletOves;
	public static Item amuletPullum;
	public static Item portable_crafting_table;
	public static Item backpack;
	public static Item satchel;
	public static Item poschip;
	public static Item upgradechip;

	//Tool Enums
	public static final Item.ToolMaterial COPPER    = EnumHelper.addToolMaterial("COPPER", 1, 186, 4.5F, 1.5F, 18);
	public static final Item.ToolMaterial BRONZE    = EnumHelper.addToolMaterial("BRONZE", 2, 1016, 5.8F, 2.0F, 16);
	public static final Item.ToolMaterial STEEL     = EnumHelper.addToolMaterial("STEEL", 2, 420, 7.8F, 2.5F, 20);
	public static final Item.ToolMaterial MEURODITE = EnumHelper.addToolMaterial("MEURODITE", 2, 905, 7.0F, 2.5F, 13);
	public static final Item.ToolMaterial TORITE    = EnumHelper.addToolMaterial("TORITE", 3, 1208, 9.0F, 3.5F, 28);
	public static final Item.ToolMaterial ICE       = EnumHelper.addToolMaterial("ICE", 2, 808, 8.0F, 3.5F, 18);
	public static final Item.ToolMaterial BLAZIUM   = EnumHelper.addToolMaterial("BLAZIUM", 2, 808, 8.0F, 3.5F, 18);
	public static final Item.ToolMaterial TITANIUM  = EnumHelper.addToolMaterial("TITANIUM", 4, 3122, 14.0F, 5.0F, 8);
	public static final Item.ToolMaterial BEDROCK   = EnumHelper.addToolMaterial("BEDROCK", 5, 6244, 7.0F, 1.0F, 5);

	//Armor Enums
	public static final ItemArmor.ArmorMaterial ARMOR_TIN       = EnumHelper.addArmorMaterial("ARMOR_TIN", "tin", 4,
	                                                                                          new int[] { 1, 2, 1, 1 },
	                                                                                          6);
	public static final ItemArmor.ArmorMaterial ARMOR_BRONZE    = EnumHelper
		                                                              .addArmorMaterial("ARMOR_BRONZE", "bronze", 30,
		                                                                                new int[] { 2, 6, 5, 2 }, 10);
	public static final ItemArmor.ArmorMaterial ARMOR_STEEL     = EnumHelper
		                                                              .addArmorMaterial("ARMOR_STEEL", "steel", 19,
		                                                                                new int[] { 3, 7, 5, 3 }, 14);
	public static final ItemArmor.ArmorMaterial ARMOR_MEURODITE = EnumHelper
		                                                              .addArmorMaterial("ARMOR_MEURODITE", "meurodite",
		                                                                                24, new int[] { 3, 6, 6, 2 },
		                                                                                10);
	public static final ItemArmor.ArmorMaterial ARMOR_TORITE    = EnumHelper
		                                                              .addArmorMaterial("ARMOR_TORITE", "torite", 31,
		                                                                                new int[] { 3, 7, 6, 3 }, 30);
	public static final ItemArmor.ArmorMaterial ARMOR_ICE       = EnumHelper.addArmorMaterial("ARMOR_ICE", "ice", 22,
	                                                                                          new int[] { 3, 7, 6, 3 },
	                                                                                          10);
	public static final ItemArmor.ArmorMaterial ARMOR_BLAZIUM   = EnumHelper
		                                                              .addArmorMaterial("ARMOR_BLAZIUM", "blazium", 22,
		                                                                                new int[] { 3, 7, 6, 3 }, 10);
	public static final ItemArmor.ArmorMaterial ARMOR_TITANIUM  = EnumHelper
		                                                              .addArmorMaterial("ARMOR_TITANIUM", "titanium",
		                                                                                66, new int[] { 6, 16, 12, 6 },
		                                                                                8);

	public static void init()
	{
		//Fruits and Vegetables
		blueberry = new ItemFood(1, 1.0F, false).setPotionEffect(Potion.healthBoost.id, 10, 0, 0.3F)
		                                        .setUnlocalizedName("blueberry")
		                                        .setCreativeTab(Minestrappolation.tabMFood);
		blackberry = new ItemFood(2, 0.4F, false).setPotionEffect(Potion.digSpeed.id, 10, 0, 0.3F)
		                                         .setUnlocalizedName("blackberry")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		raspberry = new ItemFood(1, 0.0F, false).setPotionEffect(Potion.heal.id, 1, 0, 0.3F)
		                                        .setUnlocalizedName("raspberry")
		                                        .setCreativeTab(Minestrappolation.tabMFood);
		strawberry = new ItemFood(2, 0.5F, false).setPotionEffect(Potion.damageBoost.id, 10, 0, 0.3F)
		                                         .setUnlocalizedName("strawberry")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		pepper = new ItemFood(4, 0.4F, false).setPotionEffect(Potion.moveSpeed.id, 20, 1, 0.5F)
		                                     .setUnlocalizedName("pepper").setCreativeTab(Minestrappolation.tabMFood);
		celery = new ItemFood(2, 0.4F, false).setUnlocalizedName("celery").setCreativeTab(Minestrappolation.tabMFood);
		tomato = new ItemFood(3, 0.4F, false).setUnlocalizedName("tomato").setCreativeTab(Minestrappolation.tabMFood);
		corn_on_stick = new ItemMFood(3, 0.5F, 0).setUnlocalizedName("corn_on_stick")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		grilled_corn = new ItemMFood(6, 3.0F, 0).setUnlocalizedName("grilled_corn")
		                                        .setCreativeTab(Minestrappolation.tabMFood);

		//Bread-Based Foods
		corn_meal = new ItemFood(1, 0.5F, false).setUnlocalizedName("corn_meal")
		                                        .setCreativeTab(Minestrappolation.tabMFood);
		corn_bread = new ItemFood(4, 1F, false).setUnlocalizedName("corn_bread")
		                                       .setCreativeTab(Minestrappolation.tabMFood);
		dough = new ItemFood(1, 0.2F, false).setUnlocalizedName("dough").setCreativeTab(Minestrappolation.tabMFood);
		sugar_dough = new ItemFood(1, 0.2F, false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 0.3F)
		                                          .setUnlocalizedName("sugar_dough")
		                                          .setCreativeTab(Minestrappolation.tabMFood);
		chocolate_dough = new ItemFood(1, 0.3F, false).setUnlocalizedName("chocolate_dough")
		                                              .setCreativeTab(Minestrappolation.tabMFood);
		sugar_cookie = new ItemFood(1, 0.4F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 0.5F)
		                                           .setUnlocalizedName("sugar_cookie")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		bun = new ItemFood(2, 0.3F, false).setUnlocalizedName("bun").setCreativeTab(Minestrappolation.tabMFood);
		pbj_sandwich = new ItemMFood(14, 2.5F, 0).setUnlocalizedName("pbj_sandwich")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		salmon_burger = new ItemFood(20, 2.2F, false).setPotionEffect(Potion.hunger.id, 15, 0, 0.8F)
		                                             .setUnlocalizedName("salmon_burger")
		                                             .setCreativeTab(Minestrappolation.tabMFood);
		hamburger = new ItemFood(18, 2F, false).setUnlocalizedName("hamburger")
		                                       .setCreativeTab(Minestrappolation.tabMFood);
		dry_spaghetti = new Item().setUnlocalizedName("dry_spaghetti").setCreativeTab(Minestrappolation.tabMFood);
		pie_crust = new ItemFood(2, 0.2F, false).setUnlocalizedName("pie_crust")
		                                        .setCreativeTab(Minestrappolation.tabMFood);
		apple_pie = new ItemFood(6, 0.7F, false).setUnlocalizedName("apple_pie")
		                                        .setCreativeTab(Minestrappolation.tabMFood);

		//Bowl-Based Foods
		bread_bowl = new ItemFood(2, 0.3F, false).setUnlocalizedName("bread_bowl")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		bread_mushroom_stew = new ItemFood(8, false).setUnlocalizedName("bread_mushroom_stew")
		                                            .setCreativeTab(Minestrappolation.tabMFood);
		bread_rabbit_stew = new ItemFood(12, false).setUnlocalizedName("bread_rabbit_stew")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		fried_egg = new ItemMSoup(6, 0.4F, Items.bowl, 0).setUnlocalizedName("fried_egg")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		bread_fried_egg = new ItemFood(8, 0.4F, false).setUnlocalizedName("bread_fried_egg")
		                                              .setCreativeTab(Minestrappolation.tabMFood);
		rice_bowl = new ItemMSoup(5, 0.8F, Items.bowl, 0).setUnlocalizedName("rice_bowl")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		bread_rice_bowl = new ItemMFood(7, 0.8F, 0).setUnlocalizedName("bread_rice_bowl")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		stir_fry = new ItemMSoup(8, 1F, Items.bowl, 6).setPotionEffect(Potion.moveSpeed.id, 40, 2, 1F)
		                                              .setUnlocalizedName("stir_fry")
		                                              .setCreativeTab(Minestrappolation.tabMFood);
		bread_stir_fry = new ItemMFood(10, 1F, 6).setUnlocalizedName("bread_stir_fry")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		tomato_sauce = new ItemMSoup(6, 0.4F, Items.bowl, 0).setUnlocalizedName("tomato_sauce")
		                                                    .setCreativeTab(Minestrappolation.tabMFood);
		bread_tomato_sauce = new ItemFood(8, 0.4F, false).setUnlocalizedName("bread_tomato_sauce")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		tomato_soup = new ItemMSoup(8, 3.4F, Items.bowl, 0).setUnlocalizedName("tomato_soup")
		                                                   .setCreativeTab(Minestrappolation.tabMFood);
		bread_tomato_soup = new ItemFood(10, 3.4F, false).setUnlocalizedName("bread_tomato_soup")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		spaghetti = new ItemMSoup(12, 1.5F, Items.bowl, 0).setUnlocalizedName("spaghetti")
		                                                  .setCreativeTab(Minestrappolation.tabMFood);
		bread_spaghetti = new ItemFood(14, 1.5F, false).setUnlocalizedName("bread_spaghetti")
		                                               .setCreativeTab(Minestrappolation.tabMFood);
		salad = new ItemMSoup(8, 0.2F, Items.bowl, 0).setUnlocalizedName("salad")
		                                             .setCreativeTab(Minestrappolation.tabMFood);
		bread_salad = new ItemFood(10, 0.2F, false).setUnlocalizedName("bread_salad")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		health_salad = new ItemMSoup(5, 0.1F, Items.bowl, 0).setPotionEffect(Potion.heal.id, 1, 1, 1F)
		                                                    .setUnlocalizedName("health_salad")
		                                                    .setCreativeTab(Minestrappolation.tabMFood);
		bread_health_salad = new ItemFood(7, 0.1F, false).setPotionEffect(Potion.heal.id, 1, 1, 1F)
		                                                 .setUnlocalizedName("bread_health_salad")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		saturation_salad = new ItemMSoup(4, 2F, Items.bowl, 0).setPotionEffect(Potion.healthBoost.id, 20, 1, 1F)
		                                                      .setUnlocalizedName("saturation_salad")
		                                                      .setCreativeTab(Minestrappolation.tabMFood);
		bread_saturation_salad = new ItemFood(6, 2F, false).setPotionEffect(Potion.healthBoost.id, 20, 1, 1F)
		                                                   .setUnlocalizedName("bread_saturation_salad")
		                                                   .setCreativeTab(Minestrappolation.tabMFood);
		speed_salad = new ItemMSoup(6, 0.5F, Items.bowl, 0).setPotionEffect(Potion.digSpeed.id, 20, 1, 1F)
		                                                   .setUnlocalizedName("speed_salad")
		                                                   .setCreativeTab(Minestrappolation.tabMFood);
		bread_speed_salad = new ItemFood(8, 0.5F, false).setPotionEffect(Potion.digSpeed.id, 20, 1, 1F)
		                                                .setUnlocalizedName("bread_speed_salad")
		                                                .setCreativeTab(Minestrappolation.tabMFood);
		strength_salad = new ItemMSoup(7, 0.1F, Items.bowl, 0).setPotionEffect(Potion.damageBoost.id, 20, 1, 1F)
		                                                      .setUnlocalizedName("strength_salad")
		                                                      .setCreativeTab(Minestrappolation.tabMFood);
		bread_strength_salad = new ItemFood(9, 0.1F, false).setPotionEffect(Potion.damageBoost.id, 20, 1, 1F)
		                                                   .setUnlocalizedName("bread_strength_salad")
		                                                   .setCreativeTab(Minestrappolation.tabMFood);
		ice_cream = new ItemMSoup(6, 0.6F, Items.bowl, 0).setUnlocalizedName("icecream")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);
		bread_ice_cream = new ItemMFood(8, 0.6F, 0).setUnlocalizedName("bread_icecream")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		popcorn = new ItemMSoup(5, 0.2F, Items.bowl, 0).setUnlocalizedName("popcorn")
		                                               .setCreativeTab(Minestrappolation.tabMFood);
		bread_popcorn = new ItemFood(7, 0.2F, false).setUnlocalizedName("bread_popcorn")
		                                            .setCreativeTab(Minestrappolation.tabMFood);
		glowshroom_stew = new ItemMSoup(6, 0.4F, Items.bowl, 0).setUnlocalizedName("glowshroom_stew")
		                                                       .setCreativeTab(Minestrappolation.tabMFood);
		bread_glowshroom_stew = new ItemMFood(8, 0.4F, 0).setUnlocalizedName("bread_glowshroom_stew")
		                                                 .setCreativeTab(Minestrappolation.tabMFood);

		//Bottle-Based Foods
		hot_sauce = new ItemMSoup(0, 0.2F, Items.glass_bottle, 10).setPotionEffect(Potion.moveSpeed.id, 40, 2, 1F)
		                                                          .setAlwaysEdible().setUnlocalizedName("hot_sauce")
		                                                          .setCreativeTab(Minestrappolation.tabMFood);
		jam_bottle = new ItemMSoup(4, 1.9F, Items.glass_bottle, 0).setUnlocalizedName("jam_bottle")
		                                                          .setCreativeTab(Minestrappolation.tabMFood);
		peanut_butter_bottle = new ItemMSoup(6, 1F, Items.glass_bottle, 0).setUnlocalizedName("peanut_butter_bottle")
		                                                                  .setCreativeTab(Minestrappolation.tabMFood);

		//Meats
		fat = new ItemFood(2, 3.0F, false).setPotionEffect(Potion.hunger.id, 10, 0, 0.7F).setUnlocalizedName("fat")
		                                  .setCreativeTab(Minestrappolation.tabMFood);
		squid_tentacle = new ItemFood(2, 0.3F, false).setPotionEffect(Potion.poison.id, 5, 1, 0.7F)
		                                             .setUnlocalizedName("squid_tentacle")
		                                             .setCreativeTab(Minestrappolation.tabMFood);
		calamari = new ItemFood(5, 0.6F, false).setUnlocalizedName("calimari")
		                                       .setCreativeTab(Minestrappolation.tabMFood);
		sushi = new ItemFood(14, 1.8F, false).setUnlocalizedName("sushi").setCreativeTab(Minestrappolation.tabMFood);
		lucky_sushi = new ItemMFood(12, 1.0F, 0).setUnlocalizedName("lucky_sushi")
		                                        .setCreativeTab(Minestrappolation.tabMFood);
		onigiri = new ItemFood(7, 1.0F, false).setUnlocalizedName("onigiri").setCreativeTab(Minestrappolation.tabMFood);
		flesh = new ItemFood(4, 0.4F, true).setUnlocalizedName("flesh").setCreativeTab(Minestrappolation.tabMFood);

		//Fried Foods
		fries = new ItemFood(7, 0.4F, false).setPotionEffect(Potion.hunger.id, 15, 0, 0.10F).setUnlocalizedName("fries")
		                                    .setCreativeTab(Minestrappolation.tabMFood);
		fried_fish = new ItemFood(7, 0.5F, false).setPotionEffect(Potion.hunger.id, 15, 0, 0.8F)
		                                         .setUnlocalizedName("fried_fish")
		                                         .setCreativeTab(Minestrappolation.tabMFood);
		fried_salmon = new ItemFood(9, 0.7F, false).setPotionEffect(Potion.hunger.id, 15, 0, 0.8F)
		                                           .setUnlocalizedName("fried_salmon")
		                                           .setCreativeTab(Minestrappolation.tabMFood);
		fish_and_chips = new ItemFood(14, 0.8F, false).setPotionEffect(Potion.hunger.id, 15, 0, 0.8F)
		                                              .setUnlocalizedName("fish_and_chips")
		                                              .setCreativeTab(Minestrappolation.tabMFood);

		//Misc Foods
		candy_red = new ItemMFood(0, 0, 0).setAlwaysEdible().setUnlocalizedName("candy_red")
		                                  .setCreativeTab(Minestrappolation.tabMFood);
		candy_blue = new ItemMFood(0, 0, 0).setAlwaysEdible().setUnlocalizedName("candy_blue")
		                                   .setCreativeTab(Minestrappolation.tabMFood);
		candy_yellow = new ItemMFood(0, 0, 0).setAlwaysEdible().setUnlocalizedName("candy_yellow")
		                                     .setCreativeTab(Minestrappolation.tabMFood);

		//Plant Products
		mana_leaf = new Item().setUnlocalizedName("mana_leaf").setCreativeTab(Minestrappolation.tabMMaterials);
		terracreep_spore = new ItemTerracreepSpore().setUnlocalizedName("terracreep_spore")
		                                            .setCreativeTab(Minestrappolation.tabMMaterials);

		//Minerals
		copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		tin_ingot = new Item().setUnlocalizedName("tin_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		bronze_ingot = new Item().setUnlocalizedName("bronze_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		steel_ingot = new Item().setUnlocalizedName("steel_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		blazium_ingot = new Item().setUnlocalizedName("blazium_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		titanium_ingot = new Item().setUnlocalizedName("titanium_ingot")
		                           .setCreativeTab(Minestrappolation.tabMMaterials);
		sunstone_shard = new Item().setUnlocalizedName("sunstone_shard")
		                           .setCreativeTab(Minestrappolation.tabMMaterials);
		plutonium = new Item().setUnlocalizedName("plutonium").setCreativeTab(Minestrappolation.tabMMaterials);
		uranium = new Item().setUnlocalizedName("uranium").setCreativeTab(Minestrappolation.tabMMaterials);
		radiant_quartz = new MItemFoiled().setUnlocalizedName("radiant_quartz")
		                                  .setCreativeTab(Minestrappolation.tabMMaterials);
		meurodite_gem = new Item().setUnlocalizedName("meurodite_gem").setCreativeTab(Minestrappolation.tabMMaterials);
		torite_ingot = new Item().setUnlocalizedName("torite_ingot").setCreativeTab(Minestrappolation.tabMMaterials);
		desert_quartz_item = new Item().setUnlocalizedName("desert_quartz_item")
		                               .setCreativeTab(Minestrappolation.tabMMaterials);
		blaze_shard = new Item().setUnlocalizedName("blaze_shard").setCreativeTab(Minestrappolation.tabMMaterials);
		soul_gem = new ItemSoulGem().setUnlocalizedName("soul_gem").setCreativeTab(Minestrappolation.tabMMaterials);
		glacieric_ice_shard = new Item().setUnlocalizedName("glacieric_ice_shard")
		                                .setCreativeTab(Minestrappolation.tabMMaterials);
		glacierite_ingot = new Item().setUnlocalizedName("glacierite_ingot")
		                             .setCreativeTab(Minestrappolation.tabMMaterials);
		dimensium_ingot = new Item().setUnlocalizedName("dimensium_ingot")
		                            .setCreativeTab(Minestrappolation.tabMMaterials);
		dimensium_dust = new Item().setUnlocalizedName("dimensium_dust")
		                           .setCreativeTab(Minestrappolation.tabMMaterials);
		jadachite_shard = new Item().setUnlocalizedName("jadachite_shard")
		                            .setCreativeTab(Minestrappolation.tabMMaterials);

		tin_plating = new Item().setUnlocalizedName("tin_plating").setCreativeTab(Minestrappolation.tabMMaterials);
		bronze_plating = new Item().setUnlocalizedName("bronze_plating")
		                           .setCreativeTab(Minestrappolation.tabMMaterials);
		steel_plating = new Item().setUnlocalizedName("steel_plating").setCreativeTab(Minestrappolation.tabMMaterials);
		meurodite_plating = new Item().setUnlocalizedName("meurodite_plating")
		                              .setCreativeTab(Minestrappolation.tabMMaterials);

		//Crafting Materials
		mud_ball = new ItemMudBall().setUnlocalizedName("mud_ball");
		crushed_ice = new ItemMFood(0, 0, 0).setMaxStackSize(16).setUnlocalizedName("crushed_ice")
		                                    .setCreativeTab(Minestrappolation.tabMFood);
		tallow = new Item().setUnlocalizedName("tallow").setCreativeTab(Minestrappolation.tabMMaterials);
		grease = new Item().setUnlocalizedName("grease").setCreativeTab(Minestrappolation.tabMMaterials);
		guano = new ItemGuano().setUnlocalizedName("guano").setCreativeTab(Minestrappolation.tabMMaterials);
		reinforced_stick = new Item().setUnlocalizedName("reinforced_stick")
		                             .setCreativeTab(Minestrappolation.tabMMaterials);
		propeller = new Item().setUnlocalizedName("propeller").setCreativeTab(Minestrappolation.tabMMaterials);
		animal_bones = new Item().setUnlocalizedName("animal_bones").setCreativeTab(Minestrappolation.tabMMaterials);
		wing_sinew = new Item().setUnlocalizedName("wing_sinew").setCreativeTab(Minestrappolation.tabMMaterials);
		wing_segment = new Item().setUnlocalizedName("wing_segment").setCreativeTab(Minestrappolation.tabMMaterials);
		pig_foot = new Item().setUnlocalizedName("pig_foot").setCreativeTab(Minestrappolation.tabMMaterials);
		cow_foot = new Item().setUnlocalizedName("cow_foot").setCreativeTab(Minestrappolation.tabMMaterials);
		sheep_foot = new Item().setUnlocalizedName("sheep_foot").setCreativeTab(Minestrappolation.tabMMaterials);
		chicken_foot = new Item().setUnlocalizedName("chicken_foot").setCreativeTab(Minestrappolation.tabMMaterials);
		wolf_hide = new Item().setUnlocalizedName("wolf_hide").setCreativeTab(Minestrappolation.tabMMaterials);
		technological_doodad = new Item().setUnlocalizedName("technological_doodad")
		                                 .setCreativeTab(Minestrappolation.tabMMaterials);
		advanced_tech_doodad = new Item().setUnlocalizedName("advanced_tech_doodad")
		                                 .setCreativeTab(Minestrappolation.tabMMaterials);
		inert_chip = new Item().setUnlocalizedName("inert_chip").setCreativeTab(Minestrappolation.tabMTech);
		empty_titanium_sifter = new Item().setMaxStackSize(1).setUnlocalizedName("empty_titanium_sifter")
		                                  .setCreativeTab(Minestrappolation.tabMTools);
		heart_piece = new Item().setUnlocalizedName("heart_piece").setCreativeTab(Minestrappolation.tabMTools);
		ice_charge = new ItemIceCharge().setUnlocalizedName("ice_charge");
		slime_core = new Item().setUnlocalizedName("slime_core").setCreativeTab(Minestrappolation.tabMMaterials);
		ender_aura = new Item().setUnlocalizedName("ender_aura").setCreativeTab(Minestrappolation.tabMMaterials);
		wither_bone = new Item().setUnlocalizedName("wither_bone").setCreativeTab(Minestrappolation.tabMMaterials);
		deathmeal = new ItemDeathmeal().setUnlocalizedName("deathmeal").setCreativeTab(Minestrappolation.tabMMaterials);
		will_o_wisp = new Item().setMaxStackSize(1).setUnlocalizedName("will_o_wisp")
		                        .setCreativeTab(Minestrappolation.tabMMaterials);
		diamond_dust = new Item().setUnlocalizedName("diamond_dust").setCreativeTab(Minestrappolation.tabMMaterials);
		inert_crystal_heart = new ItemInertCrystalHeart().setMaxStackSize(1).setUnlocalizedName("inert_crystal_heart")
		                                                 .setCreativeTab(Minestrappolation.tabMMaterials);
		crystal_heart = new MItemFoiled().setMaxStackSize(1).setUnlocalizedName("crystal_heart")
		                                 .setCreativeTab(Minestrappolation.tabMMaterials);
		cow_gene_sample = new Item().setUnlocalizedName("cow_gene_sample")
		                            .setCreativeTab(Minestrappolation.tabMMaterials);
		infectious_fungus = new Item().setUnlocalizedName("infectious_fungus")
		                              .setCreativeTab(Minestrappolation.tabMMaterials);
		chicken_gene_sample = new Item().setUnlocalizedName("chicken_gene_sample")
		                                .setCreativeTab(Minestrappolation.tabMMaterials);
		wolf_gene_sample = new Item().setUnlocalizedName("wolf_gene_sample")
		                             .setCreativeTab(Minestrappolation.tabMMaterials);
		sheep_gene_sample = new Item().setUnlocalizedName("sheep_gene_sample")
		                              .setCreativeTab(Minestrappolation.tabMMaterials);
		rabbit_gene_sample = new Item().setUnlocalizedName("rabbit_gene_sample")
		                               .setCreativeTab(Minestrappolation.tabMMaterials);
		bat_gene_sample = new Item().setUnlocalizedName("bat_gene_sample")
		                            .setCreativeTab(Minestrappolation.tabMMaterials);

		//Stonecutter
		chunks = new ItemChunk().setUnlocalizedName("chunks").setCreativeTab(Minestrappolation.tabMMaterials);
		dimensium_chunk = new Item().setUnlocalizedName("dimensium_chunk")
		                            .setCreativeTab(Minestrappolation.tabMMaterials);
		continnium_chunk = new Item().setUnlocalizedName("continnium_chunk")
		                             .setCreativeTab(Minestrappolation.tabMMaterials);
		bricks = new ItemBricks().setUnlocalizedName("bricks").setCreativeTab(Minestrappolation.tabMMaterials);
		bricks2 = new ItemBricks2().setUnlocalizedName("bricks2").setCreativeTab(Minestrappolation.tabMMaterials);

		//Tools and Weapons
		copper_pickaxe = new ItemMPickaxe(COPPER, copper_ingot, false, false).setUnlocalizedName("copper_pickaxe")
		                                                                     .setCreativeTab(
			                                                                     Minestrappolation.tabMTools);
		copper_axe = new ItemMAxe(COPPER, copper_ingot, false, false).setUnlocalizedName("copper_axe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		copper_shovel = new ItemMShovel(COPPER, copper_ingot, false, false).setUnlocalizedName("copper_shovel")
		                                                                   .setCreativeTab(Minestrappolation.tabMTools);
		copper_hoe = new ItemMHoe(COPPER, copper_ingot, false, false).setUnlocalizedName("copper_hoe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		copper_sword = new ItemMSword(COPPER, copper_ingot, false, false).setUnlocalizedName("copper_sword")
		                                                                 .setCreativeTab(Minestrappolation.tabMCombat);

		bronze_pickaxe = new ItemMPickaxe(BRONZE, bronze_ingot, false, false).setUnlocalizedName("bronze_pickaxe")
		                                                                     .setCreativeTab(
			                                                                     Minestrappolation.tabMTools);
		bronze_axe = new ItemMAxe(BRONZE, bronze_ingot, false, false).setUnlocalizedName("bronze_axe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		bronze_shovel = new ItemMShovel(BRONZE, bronze_ingot, false, false).setUnlocalizedName("bronze_shovel")
		                                                                   .setCreativeTab(Minestrappolation.tabMTools);
		bronze_hoe = new ItemMHoe(BRONZE, bronze_ingot, false, false).setUnlocalizedName("bronze_hoe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		bronze_sword = new ItemMSword(BRONZE, bronze_ingot, false, false).setUnlocalizedName("bronze_sword")
		                                                                 .setCreativeTab(Minestrappolation.tabMCombat);

		steel_pickaxe = new ItemMPickaxe(STEEL, steel_ingot, false, false).setUnlocalizedName("steel_pickaxe")
		                                                                  .setCreativeTab(Minestrappolation.tabMTools);
		steel_axe = new ItemMAxe(STEEL, steel_ingot, false, false).setUnlocalizedName("steel_axe")
		                                                          .setCreativeTab(Minestrappolation.tabMTools);
		steel_shovel = new ItemMShovel(STEEL, steel_ingot, false, false).setUnlocalizedName("steel_shovel")
		                                                                .setCreativeTab(Minestrappolation.tabMTools);
		steel_hoe = new ItemMHoe(STEEL, steel_ingot, false, false).setUnlocalizedName("steel_hoe")
		                                                          .setCreativeTab(Minestrappolation.tabMTools);
		steel_sword = new ItemMSword(STEEL, steel_ingot, false, false).setUnlocalizedName("steel_sword")
		                                                              .setCreativeTab(Minestrappolation.tabMCombat);

		meurodite_pickaxe = new ItemMPickaxe(MEURODITE, meurodite_gem, false, false)
			                    .setUnlocalizedName("meurodite_pickaxe").setCreativeTab(Minestrappolation.tabMTools);
		meurodite_axe = new ItemMAxe(MEURODITE, meurodite_gem, false, false).setUnlocalizedName("meurodite_axe")
		                                                                    .setCreativeTab(
			                                                                    Minestrappolation.tabMTools);
		meurodite_shovel = new ItemMShovel(MEURODITE, meurodite_gem, false, false)
			                   .setUnlocalizedName("meurodite_shovel").setCreativeTab(Minestrappolation.tabMTools);
		meurodite_hoe = new ItemMHoe(MEURODITE, meurodite_gem, false, false).setUnlocalizedName("meurodite_hoe")
		                                                                    .setCreativeTab(
			                                                                    Minestrappolation.tabMTools);
		meurodite_sword = new ItemMSword(MEURODITE, meurodite_gem, false, false).setUnlocalizedName("meurodite_sword")
		                                                                        .setCreativeTab(
			                                                                        Minestrappolation.tabMCombat);

		torite_pickaxe = new ItemMPickaxe(TORITE, torite_ingot, false, false).setUnlocalizedName("torite_pickaxe")
		                                                                     .setCreativeTab(
			                                                                     Minestrappolation.tabMTools);
		torite_axe = new ItemMAxe(TORITE, torite_ingot, false, false).setUnlocalizedName("torite_axe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		torite_shovel = new ItemMShovel(TORITE, torite_ingot, false, false).setUnlocalizedName("torite_shovel")
		                                                                   .setCreativeTab(Minestrappolation.tabMTools);
		torite_hoe = new ItemMHoe(TORITE, torite_ingot, false, false).setUnlocalizedName("torite_hoe")
		                                                             .setCreativeTab(Minestrappolation.tabMTools);
		torite_sword = new ItemMSword(TORITE, torite_ingot, false, false).setUnlocalizedName("torite_sword")
		                                                                 .setCreativeTab(Minestrappolation.tabMCombat);

		ice_pickaxe = new ItemMPickaxe(ICE, glacierite_ingot, false, true).setUnlocalizedName("ice_pickaxe")
		                                                                  .setCreativeTab(Minestrappolation.tabMTools);
		ice_axe = new ItemMAxe(ICE, glacierite_ingot, false, true).setUnlocalizedName("ice_axe")
		                                                          .setCreativeTab(Minestrappolation.tabMTools);
		ice_shovel = new ItemMShovel(ICE, glacierite_ingot, false, true).setUnlocalizedName("ice_shovel")
		                                                                .setCreativeTab(Minestrappolation.tabMTools);
		ice_hoe = new ItemMHoe(ICE, glacierite_ingot, false, true).setUnlocalizedName("ice_hoe")
		                                                          .setCreativeTab(Minestrappolation.tabMTools);
		ice_sword = new ItemMSword(ICE, glacierite_ingot, false, true).setUnlocalizedName("ice_sword")
		                                                              .setCreativeTab(Minestrappolation.tabMCombat);

		fire_pickaxe = new ItemMPickaxe(BLAZIUM, blazium_ingot, true, false).setUnlocalizedName("fire_pickaxe")
		                                                                    .setCreativeTab(
			                                                                    Minestrappolation.tabMTools);
		fire_axe = new ItemMAxe(BLAZIUM, blazium_ingot, true, false).setUnlocalizedName("fire_axe")
		                                                            .setCreativeTab(Minestrappolation.tabMTools);
		fire_shovel = new ItemMShovel(BLAZIUM, blazium_ingot, true, false).setUnlocalizedName("fire_shovel")
		                                                                  .setCreativeTab(Minestrappolation.tabMTools);
		fire_hoe = new ItemMHoe(BLAZIUM, blazium_ingot, true, false).setUnlocalizedName("fire_hoe")
		                                                            .setCreativeTab(Minestrappolation.tabMTools);
		fire_sword = new ItemMSword(BLAZIUM, blazium_ingot, true, false).setUnlocalizedName("fire_sword")
		                                                                .setCreativeTab(Minestrappolation.tabMCombat);

		titanium_pickaxe = new ItemMPickaxe(TITANIUM, titanium_ingot, false, false)
			                   .setUnlocalizedName("titanium_pickaxe").setCreativeTab(Minestrappolation.tabMTools);
		titanium_axe = new ItemMAxe(TITANIUM, titanium_ingot, false, false).setUnlocalizedName("titanium_axe")
		                                                                   .setCreativeTab(Minestrappolation.tabMTools);
		titanium_shovel = new ItemMShovel(TITANIUM, titanium_ingot, false, false).setUnlocalizedName("titanium_shovel")
		                                                                         .setCreativeTab(
			                                                                         Minestrappolation.tabMTools);
		titanium_hoe = new ItemMHoe(TITANIUM, titanium_ingot, false, false).setUnlocalizedName("titanium_hoe")
		                                                                   .setCreativeTab(Minestrappolation.tabMTools);
		titanium_sword = new ItemMSword(TITANIUM, titanium_ingot, false, false).setUnlocalizedName("titanium_sword")
		                                                                       .setCreativeTab(
			                                                                       Minestrappolation.tabMCombat);

		bedrock_pickaxe = new ItemMPickaxe(BEDROCK, Item.getItemFromBlock(Blocks.bedrock), false, false)
			                  .setUnlocalizedName("bedrock_pickaxe").setCreativeTab(Minestrappolation.tabMTools);
		bedrock_axe = new ItemMAxe(BEDROCK, Item.getItemFromBlock(Blocks.bedrock), false, false)
			              .setUnlocalizedName("bedrock_axe").setCreativeTab(Minestrappolation.tabMTools);
		bedrock_shovel = new ItemMShovel(BEDROCK, Item.getItemFromBlock(Blocks.bedrock), false, false)
			                 .setUnlocalizedName("bedrock_shovel").setCreativeTab(Minestrappolation.tabMTools);
		bedrock_hoe = new ItemMHoe(BEDROCK, Item.getItemFromBlock(Blocks.bedrock), false, false)
			              .setUnlocalizedName("bedrock_hoe").setCreativeTab(Minestrappolation.tabMTools);

		wrench = new ItemWrench().setUnlocalizedName("minestrapp_wrench").setCreativeTab(Minestrappolation.tabMTools);

		//Armor
		rad_helmet = new ItemMArmor(ARMOR_STEEL, 0, 0, uranium, "rad").setUnlocalizedName("rad_helmet")
		                                                              .setCreativeTab(Minestrappolation.tabMCombat);
		rad_chestplate = new ItemMArmor(ARMOR_STEEL, 0, 1, uranium, "rad").setUnlocalizedName("rad_chestplate")
		                                                                  .setCreativeTab(Minestrappolation.tabMCombat);
		rad_leggings = new ItemMArmor(ARMOR_STEEL, 0, 2, plutonium, "rad").setUnlocalizedName("rad_leggings")
		                                                                  .setCreativeTab(Minestrappolation.tabMCombat);
		rad_boots = new ItemMArmor(ARMOR_STEEL, 0, 3, plutonium, "rad").setUnlocalizedName("rad_boots")
		                                                               .setCreativeTab(Minestrappolation.tabMCombat);

		tin_helmet = new ItemMArmor(ARMOR_TIN, 0, 0, tin_ingot, "tin").setUnlocalizedName("tin_helmet")
		                                                              .setCreativeTab(Minestrappolation.tabMCombat);
		tin_chestplate = new ItemMArmor(ARMOR_TIN, 0, 1, tin_ingot, "tin").setUnlocalizedName("tin_chestplate")
		                                                                  .setCreativeTab(Minestrappolation.tabMCombat);
		tin_leggings = new ItemMArmor(ARMOR_TIN, 0, 2, tin_ingot, "tin").setUnlocalizedName("tin_leggings")
		                                                                .setCreativeTab(Minestrappolation.tabMCombat);
		tin_boots = new ItemMArmor(ARMOR_TIN, 0, 3, tin_ingot, "tin").setUnlocalizedName("tin_boots")
		                                                             .setCreativeTab(Minestrappolation.tabMCombat);

		bronze_helmet = new ItemMArmor(ARMOR_BRONZE, 0, 0, bronze_ingot, "bronze").setUnlocalizedName("bronze_helmet")
		                                                                          .setCreativeTab(
			                                                                          Minestrappolation.tabMCombat);
		bronze_chestplate = new ItemMArmor(ARMOR_BRONZE, 0, 1, bronze_ingot, "bronze")
			                    .setUnlocalizedName("bronze_chestplate").setCreativeTab(Minestrappolation.tabMCombat);
		bronze_leggings = new ItemMArmor(ARMOR_BRONZE, 0, 2, bronze_ingot, "bronze")
			                  .setUnlocalizedName("bronze_leggings").setCreativeTab(Minestrappolation.tabMCombat);
		bronze_boots = new ItemMArmor(ARMOR_BRONZE, 0, 3, bronze_ingot, "bronze").setUnlocalizedName("bronze_boots")
		                                                                         .setCreativeTab(
			                                                                         Minestrappolation.tabMCombat);

		steel_helmet = new ItemMArmor(ARMOR_STEEL, 0, 0, steel_ingot, "steel").setUnlocalizedName("steel_helmet")
		                                                                      .setCreativeTab(
			                                                                      Minestrappolation.tabMCombat);
		steel_chestplate = new ItemMArmor(ARMOR_STEEL, 0, 1, steel_ingot, "steel")
			                   .setUnlocalizedName("steel_chestplate").setCreativeTab(Minestrappolation.tabMCombat);
		steel_leggings = new ItemMArmor(ARMOR_STEEL, 0, 2, steel_ingot, "steel").setUnlocalizedName("steel_leggings")
		                                                                        .setCreativeTab(
			                                                                        Minestrappolation.tabMCombat);
		steel_boots = new ItemMArmor(ARMOR_STEEL, 0, 3, steel_ingot, "steel").setUnlocalizedName("steel_boots")
		                                                                     .setCreativeTab(
			                                                                     Minestrappolation.tabMCombat);

		meurodite_helmet = new ItemMArmor(ARMOR_MEURODITE, 0, 0, meurodite_gem, "meurodite")
			                   .setUnlocalizedName("meurodite_helmet").setCreativeTab(Minestrappolation.tabMCombat);
		meurodite_chestplate = new ItemMArmor(ARMOR_MEURODITE, 0, 1, meurodite_gem, "meurodite")
			                       .setUnlocalizedName("meurodite_chestplate")
			                       .setCreativeTab(Minestrappolation.tabMCombat);
		meurodite_leggings = new ItemMArmor(ARMOR_MEURODITE, 0, 2, meurodite_gem, "meurodite")
			                     .setUnlocalizedName("meurodite_leggings").setCreativeTab(Minestrappolation.tabMCombat);
		meurodite_boots = new ItemMArmor(ARMOR_MEURODITE, 0, 3, meurodite_gem, "meurodite")
			                  .setUnlocalizedName("meurodite_boots").setCreativeTab(Minestrappolation.tabMCombat);

		torite_helmet = new ItemMArmor(ARMOR_TORITE, 0, 0, torite_ingot, "torite").setUnlocalizedName("torite_helmet")
		                                                                          .setCreativeTab(
			                                                                          Minestrappolation.tabMCombat);
		torite_chestplate = new ItemMArmor(ARMOR_TORITE, 0, 1, torite_ingot, "torite")
			                    .setUnlocalizedName("torite_chestplate").setCreativeTab(Minestrappolation.tabMCombat);
		torite_leggings = new ItemMArmor(ARMOR_TORITE, 0, 2, torite_ingot, "torite")
			                  .setUnlocalizedName("torite_leggings").setCreativeTab(Minestrappolation.tabMCombat);
		torite_boots = new ItemMArmor(ARMOR_TORITE, 0, 3, torite_ingot, "torite").setUnlocalizedName("torite_boots")
		                                                                         .setCreativeTab(
			                                                                         Minestrappolation.tabMCombat);

		ice_helmet = new ItemMArmor(ARMOR_ICE, 0, 0, glacierite_ingot, "ice").setUnlocalizedName("ice_helmet")
		                                                                     .setCreativeTab(
			                                                                     Minestrappolation.tabMCombat);
		ice_chestplate = new ItemMArmor(ARMOR_ICE, 0, 1, glacierite_ingot, "ice").setUnlocalizedName("ice_chestplate")
		                                                                         .setCreativeTab(
			                                                                         Minestrappolation.tabMCombat);
		ice_leggings = new ItemMArmor(ARMOR_ICE, 0, 2, glacierite_ingot, "ice").setUnlocalizedName("ice_leggings")
		                                                                       .setCreativeTab(
			                                                                       Minestrappolation.tabMCombat);
		ice_boots = new ItemMArmor(ARMOR_ICE, 0, 3, glacierite_ingot, "ice").setUnlocalizedName("ice_boots")
		                                                                    .setCreativeTab(
			                                                                    Minestrappolation.tabMCombat);

		blazium_helmet = new ItemMArmor(ARMOR_BLAZIUM, 0, 0, blazium_ingot, "blazium")
			                 .setUnlocalizedName("blazium_helmet").setCreativeTab(Minestrappolation.tabMCombat);
		blazium_chestplate = new ItemMArmor(ARMOR_BLAZIUM, 0, 1, blazium_ingot, "blazium")
			                     .setUnlocalizedName("blazium_chestplate").setCreativeTab(Minestrappolation.tabMCombat);
		blazium_leggings = new ItemMArmor(ARMOR_BLAZIUM, 0, 2, blazium_ingot, "blazium")
			                   .setUnlocalizedName("blazium_leggings").setCreativeTab(Minestrappolation.tabMCombat);
		blazium_boots = new ItemMArmor(ARMOR_BLAZIUM, 0, 3, blazium_ingot, "blazium")
			                .setUnlocalizedName("blazium_boots").setCreativeTab(Minestrappolation.tabMCombat);

		titanium_helmet = new ItemMArmor(ARMOR_TITANIUM, 0, 0, titanium_ingot, "titanium")
			                  .setUnlocalizedName("titanium_helmet").setCreativeTab(Minestrappolation.tabMCombat);
		titanium_chestplate = new ItemMArmor(ARMOR_TITANIUM, 0, 1, titanium_ingot, "titanium")
			                      .setUnlocalizedName("titanium_chestplate")
			                      .setCreativeTab(Minestrappolation.tabMCombat);
		titanium_leggings = new ItemMArmor(ARMOR_TITANIUM, 0, 2, titanium_ingot, "titanium")
			                    .setUnlocalizedName("titanium_leggings").setCreativeTab(Minestrappolation.tabMCombat);
		titanium_boots = new ItemMArmor(ARMOR_TITANIUM, 0, 3, titanium_ingot, "titanium")
			                 .setUnlocalizedName("titanium_boots").setCreativeTab(Minestrappolation.tabMCombat);

		//Specialty Tools
		sifter = new ItemSifter(36, false).setUnlocalizedName("sifter");
		titanium_sifter = new ItemSifter(72, true, empty_titanium_sifter).setUnlocalizedName("titanium_sifter");
		charge_gun = new ItemChargeGun().setUnlocalizedName("charge_gun");
		heart_container = new ItemHeartContainer().setUnlocalizedName("heart_container")
		                                          .setCreativeTab(Minestrappolation.tabMTools);
		soulbottle = new ItemSoulBottle().setUnlocalizedName("soul_bottle").setCreativeTab(Minestrappolation.tabMTools);
		hangglider = new ItemHangGlider().setUnlocalizedName("hangglider").setCreativeTab(Minestrappolation.tabMTools);
		portable_crafting_table = new ItemPortableCrafting(0).setUnlocalizedName("portable_crafting_table")
		                                                     .setCreativeTab(Minestrappolation.tabMTools);
		backpack = new ItemBackpack(0).setUnlocalizedName("backpack").setCreativeTab(Minestrappolation.tabMTools);
		satchel = new ItemBackpack(1).setUnlocalizedName("satchel").setCreativeTab(Minestrappolation.tabMTools);
		amuletPorcum = new ItemAmuletPorcum("fames restituam").setUnlocalizedName("amulet_porcum")
		                                                      .setCreativeTab(Minestrappolation.tabMTools);
		amuletVaccam = new ItemAmuletVaccam("damnum incrementum").setUnlocalizedName("amulet_vaccam")
		                                                         .setCreativeTab(Minestrappolation.tabMTools);
		amuletOves = new ItemAmulet(36, "damnum praesidium").setUnlocalizedName("amulet_oves")
		                                                    .setCreativeTab(Minestrappolation.tabMTools);
		amuletPullum = new ItemAmulet(26, "libramen praesidium").setUnlocalizedName("amulet_pullum")
		                                                        .setCreativeTab(Minestrappolation.tabMTools);
		poschip = new ItemPosChip().setUnlocalizedName("position_chip").setCreativeTab(Minestrappolation.tabMTech);
		upgradechip = new ItemUpgradeChips().setUnlocalizedName("chips").setCreativeTab(Minestrappolation.tabMTech);
	}

	public static void register()
	{
		//Materials Tab
		register(reinforced_stick);
		register(propeller);
		register(technological_doodad);
		register(advanced_tech_doodad);
		register(animal_bones);
		register(tallow);
		register(grease);
		register(pig_foot);
		register(cow_foot);
		register(sheep_foot);
		register(chicken_foot);
		register(wolf_hide);
		register(guano);
		register(wing_sinew);
		register(wing_segment);
		register(ender_aura);
		register(wither_bone);
		register(deathmeal);
		register(will_o_wisp);
		register(slime_core);
		register(infectious_fungus);
		register(bat_gene_sample);
		register(rabbit_gene_sample);
		register(chicken_gene_sample);
		register(cow_gene_sample);
		register(sheep_gene_sample);
		register(wolf_gene_sample);
		register(mana_leaf);
		register(ice_charge);
		register(terracreep_spore);

		register(bricks);
		register(bricks2);

		register(mud_ball);
		register(chunks);
		register(dimensium_chunk);
		register(continnium_chunk);
		register(diamond_dust);
		register(dimensium_dust);
		register(desert_quartz_item);
		register(copper_ingot);
		register(tin_ingot);
		register(bronze_ingot);
		register(steel_ingot);
		register(meurodite_gem);
		register(torite_ingot);
		register(sunstone_shard);
		register(plutonium);
		register(uranium);
		register(radiant_quartz);
		register(titanium_ingot);
		register(glacieric_ice_shard);
		register(glacierite_ingot);
		register(blaze_shard);
		register(blazium_ingot);
		register(soul_gem);
		register(dimensium_ingot);
		register(jadachite_shard);
		register(tin_plating);
		register(bronze_plating);
		register(steel_plating);
		register(meurodite_plating);
		register(inert_crystal_heart);
		register(crystal_heart);

		//Foods Tab
		register(fat);
		register(blueberry);
		register(blackberry);
		register(strawberry);
		register(raspberry);
		register(pepper);
		register(celery);
		register(tomato);
		register(corn_on_stick);
		register(grilled_corn);
		register(corn_meal);
		register(dough);
		register(sugar_dough);
		register(chocolate_dough);
		register(corn_bread);
		register(dry_spaghetti);
		register(bun);
		register(pbj_sandwich);
		register(hamburger);
		register(salmon_burger);
		register(sugar_cookie);
		register(pie_crust);
		register(apple_pie);
		register(fries);
		register(fried_fish);
		register(fried_salmon);
		register(fish_and_chips);
		register(bread_bowl);
		register(bread_mushroom_stew);
		register(bread_rabbit_stew);
		register(rice_bowl);
		register(bread_rice_bowl);
		register(stir_fry);
		register(bread_stir_fry);
		register(popcorn);
		register(bread_popcorn);
		register(fried_egg);
		register(bread_fried_egg);
		register(tomato_sauce);
		register(bread_tomato_sauce);
		register(tomato_soup);
		register(bread_tomato_soup);
		register(spaghetti);
		register(bread_spaghetti);
		register(salad);
		register(bread_salad);
		register(health_salad);
		register(bread_health_salad);
		register(saturation_salad);
		register(bread_saturation_salad);
		register(speed_salad);
		register(bread_speed_salad);
		register(strength_salad);
		register(bread_strength_salad);
		register(jam_bottle);
		register(peanut_butter_bottle);
		register(hot_sauce);
		register(flesh);
		register(sushi);
		register(lucky_sushi);
		register(squid_tentacle);
		register(calamari);
		register(onigiri);
		register(crushed_ice);
		register(ice_cream);
		register(bread_ice_cream);
		register(glowshroom_stew);
		register(bread_glowshroom_stew);
		register(candy_red);
		register(candy_blue);
		register(candy_yellow);

		//Tools Tab
		register(sifter);
		register(titanium_sifter);
		register(empty_titanium_sifter);
		register(hangglider);
		register(heart_piece);
		register(heart_container);
		register(soulbottle);
		//TODO: Re-Add Portable Crafting Tables when we can get them to actually work.
		//register(portable_crafting_table);
		register(satchel);
		register(backpack);
		register(amuletPorcum);
		register(amuletVaccam);
		register(amuletOves);
		register(amuletPullum);

		//Combat Tab
		register(charge_gun);

		//Tools Tab and Combat Tab
		register(copper_pickaxe);
		register(copper_axe);
		register(copper_shovel);
		register(copper_hoe);
		register(copper_sword);

		register(rad_helmet);
		register(rad_chestplate);
		register(rad_leggings);
		register(rad_boots);

		register(tin_helmet);
		register(tin_chestplate);
		register(tin_leggings);
		register(tin_boots);

		register(bronze_pickaxe);
		register(bronze_axe);
		register(bronze_shovel);
		register(bronze_hoe);
		register(bronze_sword);

		register(bronze_helmet);
		register(bronze_chestplate);
		register(bronze_leggings);
		register(bronze_boots);

		register(steel_pickaxe);
		register(steel_axe);
		register(steel_shovel);
		register(steel_hoe);
		register(steel_sword);

		register(steel_helmet);
		register(steel_chestplate);
		register(steel_leggings);
		register(steel_boots);

		register(meurodite_pickaxe);
		register(meurodite_axe);
		register(meurodite_shovel);
		register(meurodite_hoe);
		register(meurodite_sword);

		register(meurodite_helmet);
		register(meurodite_chestplate);
		register(meurodite_leggings);
		register(meurodite_boots);

		register(torite_pickaxe);
		register(torite_axe);
		register(torite_shovel);
		register(torite_hoe);
		register(torite_sword);

		register(torite_helmet);
		register(torite_chestplate);
		register(torite_leggings);
		register(torite_boots);

		register(titanium_pickaxe);
		register(titanium_axe);
		register(titanium_shovel);
		register(titanium_hoe);
		register(titanium_sword);

		register(titanium_helmet);
		register(titanium_chestplate);
		register(titanium_leggings);
		register(titanium_boots);

		register(ice_pickaxe);
		register(ice_axe);
		register(ice_shovel);
		register(ice_hoe);
		register(ice_sword);

		register(ice_helmet);
		register(ice_chestplate);
		register(ice_leggings);
		register(ice_boots);

		register(fire_pickaxe);
		register(fire_axe);
		register(fire_shovel);
		register(fire_hoe);
		register(fire_sword);

		register(blazium_helmet);
		register(blazium_chestplate);
		register(blazium_leggings);
		register(blazium_boots);

		register(bedrock_pickaxe);
		register(bedrock_axe);
		register(bedrock_shovel);
		register(bedrock_hoe);

		register(wrench);

		//Tech Tab
		register(poschip);
		register(inert_chip);
		register(upgradechip);
	}

	public static void register(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		itemList.add(item);
	}

	public static void registerRenders()
	{
		for (Item item : itemList)
		{
			registerRender(item);
		}
	}

	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
		                                                                       new ModelResourceLocation(MReference.MODID
			                                                                                                 + ":"
			                                                                                                 + item.getUnlocalizedName()
			                                                                                                       .substring(
				                                                                                                       5),
		                                                                                                 "inventory"));
	}
}
