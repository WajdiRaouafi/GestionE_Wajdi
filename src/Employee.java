public class Employee {
    private int id;
    private String nom;
    private int age;
    private String departement;
    private String jobtitle;
    private double salaire ;

    public Employee(int id , String nom, int age, String departement, String jobtitle, double salaire) {
        this.id=id;
        this.nom = nom;
        this.age = age;
        this.departement = departement;
        this.jobtitle = jobtitle;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", departement='" + departement + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
