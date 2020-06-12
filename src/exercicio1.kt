import Compatibilidade.verificarCompatibilidadeSanguinea

fun main(){
    verificarCompatibilidadeSanguinea(Doador(
        "Guilherme", TipoSanguineo.AB, FatorRh.POSITIVO),
        Paciente("Lucas", TipoSanguineo.O, FatorRh.POSITIVO))
    }










