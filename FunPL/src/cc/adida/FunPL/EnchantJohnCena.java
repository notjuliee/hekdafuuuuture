package cc.adida.FunPL;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rit.sucy.CustomEnchantment;

public class EnchantJohnCena extends CustomEnchantment {
	static final Material[] Meme_Items = new Material[] { Material.IRON_AXE, Material.DIAMOND_AXE };

	public EnchantJohnCena() {
		super("JOHN CENA", Meme_Items, 2);
		this.max = 10;
	}
	
	@Override
    public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		target.setVelocity(target.getVelocity().add(target.getLocation().toVector().subtract(user.getLocation().toVector()).normalize().multiply(enchantLevel)));
    
		user.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, enchantLevel));
	}
}