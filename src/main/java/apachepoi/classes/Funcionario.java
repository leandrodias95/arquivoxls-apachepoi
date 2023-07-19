package apachepoi.classes;

import java.util.Objects;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}
	
}
