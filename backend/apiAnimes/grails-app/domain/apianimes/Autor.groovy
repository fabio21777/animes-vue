package apianimes

class Autor {
    String nome
    String sobreNome
    static constraints = {
      nome nullable:false
      sobreNome nullable:true
    }

  @Override
  String toString() {
    return nome
  }
}
