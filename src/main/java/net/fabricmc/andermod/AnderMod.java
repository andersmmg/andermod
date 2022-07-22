package net.fabricmc.andermod;

import net.fabricmc.andermod.armor.ApronArmorMaterial;
import net.fabricmc.andermod.block.DoorbellBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AnderMod implements ModInitializer {
    
    public static final Identifier DOORBELL_SOUND = new Identifier("andermod:doorbell");
    public static SoundEvent DOORBELL_EVENT = new SoundEvent(DOORBELL_SOUND);
    
    public static final Identifier APRON_SOUND = new Identifier("andermod:item.armor.equip_apron");
    public static SoundEvent APRON_SOUND_EVENT = new SoundEvent(APRON_SOUND);

    // Creative tab for mod
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier("andermod", "general"),
        () -> new ItemStack(AnderMod.FLOOR_TILES_BLOCK));

    public static final ArmorMaterial APRON_MATERIAL = new ApronArmorMaterial();
    // public static final Item CUSTOM_MATERIAL = new CustomMaterialItem(new Item.Settings().group(AnderMod.ITEM_GROUP));
    public static final Item APRON_MATERIAL_CHESTPLATE = new ArmorItem(APRON_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(AnderMod.ITEM_GROUP));
        
	public static final Block FLOOR_TILES_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f));

	// public static final DoorbellBlock DOORBELL_BLOCK = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock OAK_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock SPRUCE_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock BIRCH_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock JUNGLE_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock ACACIA_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());
	public static final DoorbellBlock DARK_OAK_DOORBELL = new DoorbellBlock(FabricBlockSettings.of(Material.WOOD).strength(0.5f).nonOpaque());

    public static final Item ONE_DOLLAR_ITEM = new Item(new FabricItemSettings().group(AnderMod.ITEM_GROUP));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, AnderMod.DOORBELL_SOUND, DOORBELL_EVENT);
    
        Registry.register(Registry.ITEM, new Identifier("andermod", "apron"), APRON_MATERIAL_CHESTPLATE);


        Registry.register(Registry.BLOCK, new Identifier("andermod", "oak_doorbell"), OAK_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "oak_doorbell"), new BlockItem(OAK_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("andermod", "spruce_doorbell"), SPRUCE_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "spruce_doorbell"), new BlockItem(SPRUCE_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("andermod", "birch_doorbell"), BIRCH_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "birch_doorbell"), new BlockItem(BIRCH_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("andermod", "jungle_doorbell"), JUNGLE_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "jungle_doorbell"), new BlockItem(JUNGLE_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("andermod", "acacia_doorbell"), ACACIA_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "acacia_doorbell"), new BlockItem(ACACIA_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("andermod", "dark_oak_doorbell"), DARK_OAK_DOORBELL);
        Registry.register(Registry.ITEM, new Identifier("andermod", "dark_oak_doorbell"), new BlockItem(DARK_OAK_DOORBELL, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("andermod", "floor_tiles"), FLOOR_TILES_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("andermod", "floor_tiles"), new BlockItem(FLOOR_TILES_BLOCK, new FabricItemSettings().group(AnderMod.ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("andermod", "one_dollar"), ONE_DOLLAR_ITEM);
    }
}