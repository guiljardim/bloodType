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

class BNegativoTeste {

    private lateinit var pacienteNormalize:Sangue

    @Before
    fun init(){
        val paciente = Doador("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        pacienteNormalize = "${paciente.tipoSanguineo.value}${paciente.fatorRh.value}".normalize()

    }

    @Test
    fun testBnegativoComAPositivo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComANegativo() {
        val doador = Paciente("teste", TipoSanguineo.A, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComBPositivo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComBNegativo() {
        val doador = Paciente("teste", TipoSanguineo.B, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComABPositivo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComABNegativo() {
        val doador = Paciente("teste", TipoSanguineo.AB, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComOPositivo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.POSITIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(false, pacienteNormalize.eDoador(doadorNormalize))
    }

    @Test
    fun testBnegativoComONegativo() {
        val doador = Paciente("teste", TipoSanguineo.O, FatorRh.NEGATIVO)
        val doadorNormalize = "${doador.tipoSanguineo.value}${doador.fatorRh.value}".normalize()

        Assert.assertEquals(true, pacienteNormalize.eDoador(doadorNormalize))
    }


}