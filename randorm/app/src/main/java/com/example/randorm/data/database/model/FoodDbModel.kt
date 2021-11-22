package com.example.randorm.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.randorm.R

@Entity
data class FoodDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long?,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String ,
    @ColumnInfo(name = "image") val image: Int ,
) {


    companion object {

        val DEFAULT_FOODS = listOf(
            FoodDbModel(
                id=1,
                title = "Món cá  gáy kho",
                image = R.drawable.ca,
                description = "Các món cá kho, đặc biệt là cá gáy kho luôn có sức hút vô cùng lớn đối với mọi người"
            ),
            FoodDbModel(
                id=1,
                title = "cá rô phi chiên",
                image = R.drawable.carophichien,
                description = "cá rô phi chiên giòn ngon tốn cơm ,Thịt cá bên ngoài giòn rụm, bên trong chắc thịt khi dùng kèm bánh tráng và rau sống, chấm với mắm nêm chua ngọt sẽ khiến món ăn tăng thêm hương "
            ),
            FoodDbModel(
                id=1,
                title = "Thịt bò bít tết",
                image = R.drawable.mediaitem114851280,
                description = "thịt bò lát phẳng, thường được nướng vỉ, áp chảo hoặc nướng broiling ở nhiệt độ cao. Những miếng thịt mềm hơn được cắt ra từ phần thăn và sườn được làm chín nhanh chóng, sử dụng nhiệt khô và phục vụ toàn bộ."
            ),
            FoodDbModel(
                id=1,
                title = "Xúc xích chiên",
                image = R.drawable.meet4173185960720,
                description = "Xúc Xích Chiên giòn sựt nóng hổi và thơm ngon"
            ),
            FoodDbModel(
                id=1,
                title = "Món cá kho",
                image = R.drawable.monngontuca,
                description = "Các món cá kho vốn dễ đưa cơm với hương vị riêng, vô cùng hấp dẫn mà lại bổ dưỡng, thích hợp để các chị em trổ tài để chiêu đãi gia đình"
            )

        )
    }
}