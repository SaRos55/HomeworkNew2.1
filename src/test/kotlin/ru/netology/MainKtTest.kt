package ru.netology

import calcComission
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcComission_Maestro_withoutComission() {

        val testTypeCard = "Maestro"
        val testPrevTransfer = 50000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(0, result)

    }

    @Test
    fun calcComission_Maestro_withComission() {

        val testTypeCard = "Maestro"
        val testPrevTransfer = 80000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(56_00, result)

    }
    @Test
    fun calcComission_Mastercard_withoutComission() {

        val testTypeCard = "Mastercard"
        val testPrevTransfer = 50000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(0, result)

    }

    @Test
    fun calcComission_Mastercard_withComission() {

        val testTypeCard = "Mastercard"
        val testPrevTransfer = 80000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(56_00, result)

    }

    @Test
    fun calcComission_Mir_withComission() {

        val testTypeCard = "Мир"
        val testPrevTransfer = 50000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(45_00, result)

    }

    @Test
    fun calcComission_Mir_withMinComission() {

        val testTypeCard = "Мир"
        val testPrevTransfer = 80000_00
        val testTransfer = 1000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(35_00, result)

    }

    @Test
    fun calcComission_Visa_withComission() {

        val testTypeCard = "Visa"
        val testPrevTransfer = 50000_00
        val testTransfer = 6000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(45_00, result)

    }

    @Test
    fun calcComission_Visa_withMinComission() {

        val testTypeCard = "Visa"
        val testPrevTransfer = 80000_00
        val testTransfer = 1000_00

        val result = calcComission(
            typeCard = testTypeCard,
            prevTransfer = testPrevTransfer,
            transfer = testTransfer
        )

        assertEquals(35_00, result)

    }
}