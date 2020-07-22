package interfaceAndImplement.property;

public abstract class ItemAbstract {
    public String name;
    public int price;

    public abstract boolean disposable();

}

class LifePotionAbstract extends ItemAbstract{

    @Override
    public boolean disposable(){
        return true;
    }
}

class WeaponAbstract extends ItemAbstract{
    @Override
    public boolean disposable() {
        return false;
    }
}
