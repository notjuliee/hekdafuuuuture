package cc.adida.FunPL;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rit.sucy.CustomEnchantment;

public class EnchantExplodabow extends CustomEnchantment {
	static final Material[] Bow = new Material[] { Material.BOW };

	public EnchantExplodabow() {
		super("Explodabow", Bow, 2);
		this.max = 5;
	}
	
	@Override
    public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		if (event.getCause().equals(DamageCause.PROJECTILE)) {
			user.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 255));
			target.getWorld().createExplosion(target.getLocation().getX(), target.getLocation().getY(), target.getLocation().getZ(), (float) enchantLevel/2, false, false);
		}
	}
}
