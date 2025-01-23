package Survey;

class Planet {
        private final String name;
        private final int diameter;
        private final int population;

        public Planet(String name, int diameter, int population) {
            this.name = name;
            this.diameter = diameter;
            this.population = population;
        }

        public int getPopulation() {
            return population;
        }

        public int getDiameter() {
            return diameter;
        }
    }
