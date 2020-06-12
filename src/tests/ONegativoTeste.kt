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

class ONegativoTeste {

    private lateinit var pacienteNormalize:Sangue

    @Before
    fun init(){
        val paciente = Doador("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        pacienteNormalize = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

    }

    @Test
    fun testOnegativoComAPositivo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComANegativo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComBPositivo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComBNegativo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComABPositivo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComABNegativo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComOPositivo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testOnegativoComONegativo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }


}