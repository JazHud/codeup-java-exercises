public class Fighter { //<--fighter constructor aka blueprint fore object fields or default values
    public String name;
    public int hitPoints; //<-- instance variable
    public int maxDamage; //<-- instance variable
    public void printStats(){//<-- instance method
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }
    public void battleRoar(){//<-- instance method
        System.out.printf("I am %s and I will destroy you%n", name);
    }
    public int attackRoll(){ //<-- method called inside fighter class
        return D20.rollD20();
    }
}
