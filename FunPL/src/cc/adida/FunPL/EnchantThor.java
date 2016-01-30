package cc.adida.FunPL;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rit.sucy.CustomEnchantment;

public class EnchantThor extends CustomEnchantment {
	static final Material[] THOR_Items = new Material[] { Material.IRON_AXE, Material.DIAMOND_AXE };
	
	public EnchantThor() {
		super("Defensive", THOR_Items, 2);
		this.max = 10;
	}
	@Override
	public void applyMiscEffect(Player user, int enchant, PlayerInteractEvent event) {
		user.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, enchant*20, 2));
		user.getItemInHand().setDurability((short) (user.getItemInHand().getDurability()+enchant*5));
	}
}