nmftx-original\bin\families2persons.exe input\familyGL.model output\personsOrigBatch.model
nmftx-changes\bin\families2persons.exe input\familyGL.model output\personsImpBatchFromGL.model 0 dummy.model
nmftx-changes\bin\families2persons.exe input\familyGL.model output\personsImpIncFromGL.model 1000 input\familyChanged.model
nmftx-changes\bin\families2persons.exe input\familyChanged.model output\personsImpBatchFromChanged.model 0 dummy.model
nmftx-original\bin\families2persons.exe input\familyChanged.model output\personsOrigChanged.model

