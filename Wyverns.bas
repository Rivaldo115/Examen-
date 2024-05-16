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

Public Sub CreateWyvern(Nombre As String, Elemento As String, Tipo_WyvernId As String) As ResumableSub
    Dim Params As Map
    Params.Initialize
    Params.Put("Nombre", Nombre)
    Params.Put("Elemento", Elemento)
    Params.Put("Tipo_WyvernId", Tipo_WyvernId)

    Dim Job As HttpJob
    Job.Initialize("CreateWyvern", Me)
    Job.PostString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns", CreateJson(Params))

    Wait For (Job) JobDone(Job As HttpJob)
    If Job.Success Then
        Log("Wyvern created successfully: " & Job.GetString)
        Msgbox("Wyvern creado exitosamente", "Éxito")
    Else
        Log("Error: " & Job.ErrorMessage)
        Msgbox("Error al crear Wyvern: " & Job.ErrorMessage, "Error")
    End If
    Job.Release
End Sub


Public Sub ReadWyvernById(Id As String) As ResumableSub
    Dim Job As HttpJob
    Job.Initialize("ReadWyvernById", Me)
    Job.Download("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/" & Id)

    Wait For (Job) JobDone(Job As HttpJob)
    If Job.Success Then
        Log("Wyvern retrieved successfully: " & Job.GetString)
        ' Parse JSON and return the Wyvern object
        Dim parser As JSONParser
        parser.Initialize(Job.GetString)
        Dim wyvern As Map = parser.NextObject
        Log(wyvern)
        Msgbox("Wyvern obtenido exitosamente", "Éxito")
        Return wyvern
    Else
        Log("Error: " & Job.ErrorMessage)
        Msgbox("Error al obtener Wyvern: " & Job.ErrorMessage, "Error")
        Return Null
    End If
	Job.Release
End Sub

Public Sub UpdateWyvern(Id As String, Nombre As String, Elemento As String, Tipo_WyvernId As String) As ResumableSub
	Dim Params As Map
	Params.Initialize
	Params.Put("Nombre", Nombre)
	Params.Put("Elemento", Elemento)
	Params.Put("Tipo_WyvernId", Tipo_WyvernId)

	Dim Job As HttpJob
	Job.Initialize("UpdateWyvern", Me)
	Job.PutString("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/" & Id, CreateJson(Params))

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Wyvern updated successfully: " & Job.GetString)
		Msgbox("Wyvern actualizado exitosamente", "Éxito")
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al actualizar Wyvern: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Public Sub DeleteWyvern(Id As String) As ResumableSub
	Dim Job As HttpJob
	Job.Initialize("DeleteWyvern", Me)
	Job.Delete("https://6637fe834253a866a24c8fc8.mockapi.io/prueba/Wyverns/" & Id)

	Wait For (Job) JobDone(Job As HttpJob)
	If Job.Success Then
		Log("Wyvern deleted successfully")
		Msgbox("Wyvern eliminado exitosamente", "Éxito")
	Else
		Log("Error: " & Job.ErrorMessage)
		Msgbox("Error al eliminar Wyvern: " & Job.ErrorMessage, "Error")
	End If
	Job.Release
End Sub

Private Sub CreateJson(Params As Map) As String
	Dim json As JSONGenerator
	json.Initialize(Params)
	Return json.ToString
End Sub

   

