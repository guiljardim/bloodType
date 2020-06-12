import Sangue.*

val APositivo = mutableListOf(APOSITIVO, ANEGATIVO, OPOSITIVO, ONEGATIVO)
val ANegativo = mutableListOf(ANEGATIVO, ONEGATIVO)
val BPositivo = mutableListOf(BPOSITIVO, BNEGATIVO, OPOSITIVO, ONEGATIVO)
val BNegativo = mutableListOf(BNEGATIVO, ONEGATIVO)
val ABPositivo = mutableListOf(APOSITIVO, ANEGATIVO, ABPOSITIVO, ABNEGATIVO, BPOSITIVO, BNEGATIVO, OPOSITIVO, ONEGATIVO)
val ABNegativo = mutableListOf(ANEGATIVO, BNEGATIVO, ABNEGATIVO, ONEGATIVO)
val OPositivo = mutableListOf(OPOSITIVO, ONEGATIVO)
val ONegativo = mutableListOf(ONEGATIVO)
val allBloodsType = mapOf(APositivo to APOSITIVO, ANegativo to ANEGATIVO, BPositivo to BPOSITIVO,
    BNegativo to BNEGATIVO, ABPositivo to ABPOSITIVO, ABNegativo to ABNEGATIVO, OPositivo to OPOSITIVO,
    ONegativo to ONEGATIVO)

fun Sangue.eDoador(sangueDoador:Sangue): Boolean =
    allBloodsType
        .filter{ it.value == this }
        .map { it.key.contains(sangueDoador) }
        .first()


fun String.normalize(): Sangue = when(this){
    "A+" ->  APOSITIVO
    "A-"->  ANEGATIVO
    "B+" ->  BPOSITIVO
    "B-"->  BNEGATIVO
    "AB+" ->  ABPOSITIVO
    "AB-"->  ABNEGATIVO
    "O+"->  OPOSITIVO
    "O-"->  ONEGATIVO
    else -> NAOEXISTENTE
}

fun Boolean.resultadoFinal(doador: Doador, paciente: Paciente): String =
    if(this){
        "${doador.nome} é compatível com ${paciente.nome}"
    }else{
        "${doador.nome} não é compatível com ${paciente.nome}"

    }
