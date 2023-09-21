package org.java.gift;

public class Regalo {

private String nome;
private String destinatario;

public Regalo(String destinatario,  String nome) {
	
	setNome(nome);
	setDestinatario(destinatario);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDestinatario() {
	return destinatario;
}

public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}

}
