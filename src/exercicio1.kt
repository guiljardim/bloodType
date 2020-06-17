import Compatibilidade.verificarCompatibilidadeSanguinea

fun main(){
    verificarCompatibilidadeSanguinea(
            Doador("Thais", TipoSanguineo.O, FatorRh.NEGATIVO),
        Paciente("Joãozinho", TipoSanguineo.AB, FatorRh.POSITIVO))

//    verificarCompatibilidadeSanguinea(
//            Doador("Joãozinho", TipoSanguineo.AB, FatorRh.POSITIVO),
//            Paciente("Thais", TipoSanguineo.O, FatorRh.NEGATIVO))

}












