applicationUsers
appliationUserId
applicationUserName
applicationUserRole
createdDate
lastUpdateDate
lastUpdatedBy

Equipment
equipmentId
equipmentName
equipmentDescription
equipmentLocation
equipmentStatus

equipmentComboId
createdDate
lastUpdateDate
lastUpdatedBy

EquipmentCombo
equipmentComboId
comboNumber
equipmentComboDescription
createdDate
lastUpdateDate
lastUpdatedBy

checkOut
equuipmentId
equipmentComboId
equipmentName
equipmentDescription
equipmentStatus
studentId
checkOutDateAndTime
checkedOutBy 				reference applicationUserId
checkInDateAndTime
checkedInBy  				references applicationUserId
createdDate
lastUpdateDate
lastUpdatedBy

Student
studentId
studentFirstName
studentLastName
createdDate
lastUpdateDate
lastUpdateBy