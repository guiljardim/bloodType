package tests

import Doador
import Paciente
import Sangue
import eDoador
import normalize
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ABNegativoTeste {

    private lateinit var pacienteNormalize:Sangue

    @Before
    fun init(){
        val paciente = Doador("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        pacienteNormalize = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

    }

    @Test
    fun testABNegativoComAPositivo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComANegativo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComBPositivo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComBNegativo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComABPositivo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComABNegativo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComOPositivo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun TestABNegativoComONegativo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }
}