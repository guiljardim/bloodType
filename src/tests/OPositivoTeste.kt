package tests

import Doador
import FatorRh
import Paciente
import Sangue
import TipoSanguineo
import eDoador
import normalize
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class OPositivoTeste {

    private lateinit var pacienteNormalize:Sangue

    @Before
    fun init(){
        val paciente = Doador("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        pacienteNormalize = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

    }

    @Test
    fun testOPositivoComAPositivo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComANegativo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComBPositivo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComBNegativo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComABPositivo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComABNegativo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComOPositivo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOPositivoComONegativo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }


}