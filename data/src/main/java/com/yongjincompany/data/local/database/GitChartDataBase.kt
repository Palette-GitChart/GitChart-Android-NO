package com.yongjincompany.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yongjincompany.data.local.dao.HomeDao
import com.yongjincompany.data.local.entity.MyProfileRoomEntity
import com.yongjincompany.data.local.entity.TodayCommitRoomEntity
import com.yongjincompany.data.local.entity.WeeklyCommitRoomEntity
import com.yongjincompany.data.local.entity.YearCommitRoomEntity

@Database(
    entities = [
        MyProfileRoomEntity::class,
        TodayCommitRoomEntity::class,
        WeeklyCommitRoomEntity::class,
        YearCommitRoomEntity::class
    ], version = 1, exportSchema = false
)

@TypeConverters(
    value = [
]

)

abstract class GitChartDataBase : RoomDatabase() {
    abstract fun homeDao(): HomeDao
}