B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private HttpClient As OkHttpClient
End Sub

Public Sub Initialize
	HttpClient.Initialize("HttpClient")
End Sub

Public Sub CreateTipoWyvern(Nombre As String) As ResumableSub
	Dim Params As Map
	Params.Initialize
	Params.Put("Nombre", Nombre)

	Dim Job As HttpJob
	Job.Initialize("CreateTipoWyvern", Me)
	Job.PostString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern", CreateJson(Params))

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Tipo Wyvern created successfully: " & Job.GetString)
		Msgbox("Tipo Wyvern creado exitosamente", "Éxito")
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al crear Tipo Wyvern: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Public Sub ReadTipoWyvernById(Id As String) As ResumableSub
	Dim Job As HttpJob
	Job.Initialize("ReadTipoWyvernById", Me)
	Job.Download("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/" & Id)

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Tipo Wyvern retrieved successfully: " & Job.GetString)
		' Parse JSON and return the Tipo Wyvern object
		Dim parser As JSONParser
		parser.Initialize(Job.GetString)
		Dim tipoWyvern As Map = parser.NextObject
		Log(tipoWyvern)
        
		' Rellenar los campos de texto con los datos obtenidos
		CallSub2(Main, "FillTipoWyvernDetails", tipoWyvern)
        
		Msgbox("Tipo Wyvern obtenido exitosamente", "Éxito")
		Return tipoWyvern
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al obtener Tipo Wyvern: " & Job.ErrorMessage, "Error")
		Return Null
	End If
	Job.Release
End Sub

Public Sub UpdateTipoWyvern(Id As String, Nombre As String) As ResumableSub
	Dim Params As Map
	Params.Initialize
	Params.Put("Nombre", Nombre)

	Dim Job As HttpJob
	Job.Initialize("UpdateTipoWyvern", Me)
	Job.PutString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/" & Id, CreateJson(Params))

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Tipo Wyvern updated successfully: " & Job.GetString)
		Msgbox("Tipo Wyvern actualizado exitosamente", "Éxito")
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al actualizar Tipo Wyvern: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Public Sub DeleteTipoWyvern(Id As String)
	Dim Job As HttpJob
	Job.Initialize("DeleteTipoWyvern", Me)
	Job.Delete("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Tipo_Wyvern/" & Id)

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Tipo Wyvern deleted successfully")
		Msgbox("Tipo Wyvern eliminado exitosamente", "Éxito")
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al eliminar Tipo Wyvern: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Private Sub CreateJson(Params As Map) As String
	Dim json As JSONGenerator
	json.Initialize(Params)
	Return json.ToString
End Sub
