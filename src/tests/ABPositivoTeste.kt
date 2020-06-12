package tests

import Doador
import Paciente
import Sangue
import eDoador
import normalize
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ABPositivoTeste {
    private lateinit var pacienteNormalize:Sangue

    @Before
    fun init(){
        val paciente = Doador("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        pacienteNormalize = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

    }

    @Test
    fun TestABPositivoComAPositivo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComANegativo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComBPositivo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComBNegativo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComABPositivo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComABNegativo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComOPositivo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABPositivoComONegativo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }
}