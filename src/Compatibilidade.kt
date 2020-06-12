object Compatibilidade {

    fun verificarCompatibilidadeSanguinea(doador: Doador, paciente: Paciente){
        val sangueDoador = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()
        val sanguePaciente = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

        val resultado = sanguePaciente.eDoador(sangueDoador)

        print(resultado.resultadoFinal(doador, paciente))
    }
}