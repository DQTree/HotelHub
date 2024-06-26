package org.cheese.hotelhubserver.repository.jdbi.mappers

import org.cheese.hotelhubserver.domain.user.PasswordValidationInfo
import org.jdbi.v3.core.mapper.ColumnMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet
import java.sql.SQLException

class PasswordValidationInfoMapper : ColumnMapper<PasswordValidationInfo> {
    @Throws(SQLException::class)
    override fun map(
        r: ResultSet,
        columnNumber: Int,
        ctx: StatementContext?,
    ): PasswordValidationInfo = PasswordValidationInfo(r.getString(columnNumber))
}
