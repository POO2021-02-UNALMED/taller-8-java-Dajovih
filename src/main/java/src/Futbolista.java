public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;}
	
	public Futbolista() {
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";}
	
	public int compareTo(Futbolista futbol) {
		return 0;}
	
	public boolean equals (Futbolista f) {
		return this.equals(f);}
		
	public boolean jugarConLasManos() {
		return false;}
	
	public String toString() {
		return "El futbolista "+this.nombre+" tiene "+this.edad+ ", y juega de "+this.posicion;}
	
	public String getNombre() {
		return nombre;}
	
	public int getEdad() {
		return edad;}
	
	public String getPosicion() {
		return posicion;}
	
	public void setNombre(String nuevo) {
		nombre=nuevo;}
	
	public void setEdad(int nuevo) {
		edad=nuevo;}
}
