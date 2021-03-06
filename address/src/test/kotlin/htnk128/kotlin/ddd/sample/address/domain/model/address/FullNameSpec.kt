package htnk128.kotlin.ddd.sample.address.domain.model.address

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class FullNameSpec : StringSpec({

    "正しい値の場合インスタンスを生成できる" {
        forall(
            row("a".repeat(100))
        ) { value ->
            FullName.valueOf(value).value() shouldBe value
        }
    }

    "不正な値の場合例外となること" {
        forall(
            row(""),
            row("a".repeat(101))
        ) { value ->
            shouldThrow<AddressInvalidRequestException> {
                FullName.valueOf(value)
            }
        }
    }
})
