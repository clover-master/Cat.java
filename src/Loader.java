
public class Loader
{
    public static void main(String[] args)
    {
        Cat barsik = new Cat();

        System.out.println("Барсик");
        System.out.println(barsik.getWeight());
        barsik.feed((double) 100);
        System.out.println(barsik.getWeight());
        System.out.println(barsik.getStatus());

        while(!barsik.getStatus().equals("Dead")){
            barsik.meow((double) - 1000);
        }
        System.out.println("Барсик");

        System.out.println(barsik.getStatus());

        Cat masya = new Cat();

        System.out.println("Мася");
        System.out.println(masya.getWeight());
        masya.feed((double) 10000);
        System.out.println(masya.getWeight());
        System.out.println(masya.getStatus());

        Cat strelka = new Cat();

        System.out.println("Стрелка");
        System.out.println(strelka.getWeight());
        strelka.drink((double) 50);
        System.out.println(strelka.getWeight());
        System.out.println(strelka.getStatus());

        Cat belka = new Cat();

        System.out.println("Белка");
        System.out.println(belka.getWeight());
        belka.meow((double) 100);
        System.out.println(belka.getWeight());
        System.out.println(belka.getStatus());

        Cat musya = new Cat();

        System.out.println("Муся");
        System.out.println(musya.getWeight());
        musya.feed((double) 100);
        System.out.println(musya.getWeight());
        System.out.println(musya.getStatus());

    }

}

