package interfaceAndImplement.property;

public abstract class ItemAnonymous {
    String name;
    int price;

    public abstract boolean disposable();

    public static void main(String[] args) {
        ItemAnonymous itemAnonymous = new ItemAnonymous() {

            @Override
            public boolean disposable(){
                System.out.println("itemAnonymous.disposable");
                return true;
            }
        };

        ItemAnonymous itemAnonymous2 = new ItemAnonymous() {
            @Override
            public boolean disposable() {
                System.out.println("itemAnonymous2.disposable");
                return false;
            }
        };

        itemAnonymous.disposable();
        itemAnonymous2.disposable();
    }


}
