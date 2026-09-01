<# This script is to check and install the Arch/Intd services and applications from a scratch stick install and/or after joining STUDENTI domain

Made by: Josh Grant
Created on: 08/30/26
Modified on: 08/30/26

Architecture x64
OS: Windows 11 25H2
Manufactor: Dell
Model: Presicion T5820

#>

$global:Nprograms = @(
    @{Name = "Ninite"; Path = "\\ucsarch\apps$\Ninite"; Arguments = ""},
    @{Name = "Nvidia App"; Path = "\\ucsarch\apps$\Nvidia"; Arguments = ""},
    @{Name = "Nvidia Driver"; Path = "\\ucsarch\apps$\Nvidia"; Arguments = ""}
)
$global:Bprograms = @(
    @{Name = "Adobe CC"; Path = "\\artcomm\oit$\Installers\Adobe\cc26\"; Arguments = ""},
    @{Name = "Autodesk"; Path = "\\ucsarch\apps$\Autodesk\2027\"; Arguments = ""},
    @{Name = "SketchUp 2026"; Path = "\\ucsarch\apps$\SketchUp\"; Arguments = ""},
    @{Name = "Lumion Student 2026"; Path = "\\ucsarch\apps$\Lumion\"; Arguments = ""},
    @{Name = "Lumion Plugin for Revit 2027"; Path = "\\ucsarch\apps$\Lumion\"; Arguments = ""}
)
$global:Sprograms = (Name = "Security Cert for Lumion" Path = "\\ucsarch\apps$\" Arguments = "")
$global:Pprograms = (Name = "Prusa Software" Path = "\\ucsarch\apps$\Prusa\" Arguments = "")



# Does the intial check to see if computer is added to STUDENTI domain
$chkdomstat = (Get-WmiObject -Class Win32_ComputerSystem).PartOfDomain
if ($chkdomstat -eq "true") {Write-Host "Went to join domain"}
else {Write-Host "Went to install apps"}


