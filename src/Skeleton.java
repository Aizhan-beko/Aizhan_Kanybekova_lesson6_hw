class Skeleton extends Boss {
    private int arrowNumber;

    public int getArrowNumber() {
        return arrowNumber;
    }

    public void setArrowNumber(int arrowNumber) {
        this.arrowNumber = arrowNumber;

    }

    public String printInfo() {
        return super.printInfo() + "Number of arrow: " + arrowNumber;
    };


    }

