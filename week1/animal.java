class AnimalKingdom {
    long lifespan;
    float weight;

    AnimalKingdom(long lifespan, float weight) {
        this.lifespan = lifespan;
        this.weight = weight;
    }

    public void print() {
        System.out.println("Lifespan : " + lifespan);
        System.out.println("Weight : " + weight);
    }
}

class Aquatic extends AnimalKingdom {
    boolean scales;

    Aquatic(long lifespan, float weight, boolean skin) {
        super(lifespan, weight);
        scales = skin;
    }

    public void print() {
        super.print();
        System.out.println("Scales : " + scales);
    }
}

class Land extends AnimalKingdom {
    short vision; // 0 => nocturnal, 1 => only day light, 2 => both

    Land(long lifespan, float weight, short vision) {
        super(lifespan, weight);
        this.vision = vision;
    }

    public void print() {
        super.print();
        System.out.println("Vision : " + vision);
    }
}

class Pet extends Land {
    String name;

    Pet(long lifespan, float weight, short vision, String name) {
        super(lifespan, weight, vision);
        this.name = name;
    }

    public void print() {
        System.out.println("Name : " + name);
        super.print();
    }
}

class Wild extends Land {
    float speed;

    Wild(long lifespan, float weight, short vision, float speed) {
        super(lifespan, weight, vision);
        this.speed = speed;
    }

    public void print() {
        super.print();
        System.out.println("Speed : " + speed);
    }
}

class animal{
    public static void main(String[] args) {
        // write according to need;
    }
}